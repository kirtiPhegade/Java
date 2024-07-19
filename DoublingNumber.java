package functionInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DoublingNumber {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
        Consumer<Integer> conObj = (num)->{
            System.out.println(num*2);
        };
        intList.forEach(conObj);
    }
}
