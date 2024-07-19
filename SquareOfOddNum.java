package functionInterface.ConsumerAndPredictor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SquareOfOddNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> findOdd = (num)->num%2!=0;

        Consumer<Integer> printSq = (num)->System.out.println(num*num);

        list.stream()
                .filter(findOdd)
                .forEach(printSq);
    }
}
