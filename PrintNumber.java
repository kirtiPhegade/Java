package functionInterface.consumer;
import java.util.*;
import java.util.function.Consumer;

public class PrintNumber {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Consumer<Integer> conObj = (num) -> {
            System.out.println(num);
        };
        numbers.forEach(conObj);
    }
}
