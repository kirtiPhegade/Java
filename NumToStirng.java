package functionInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumToStirng {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(23,24,25,26,75);
        Consumer<Integer> conObj = (num) ->{
            System.out.println(num.toString());
        };
        list.forEach(conObj);
    }
}
