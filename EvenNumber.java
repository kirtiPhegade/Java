package functionInterface.ConsumerAndPredictor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EvenNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> p1 = (num)->num%2==0;
        Consumer<Integer> conObj = (num) ->{
            System.out.println(num+" Is even");
        };
//        for(int i=0; i< list.size();i++){
//            if(p1.test(list.get(i))){
//                conObj.accept(list.get(i));
//            }
//        }
        list.stream()
                .filter(p1)
                .forEach(conObj);

    }
}
