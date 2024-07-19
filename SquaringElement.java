package functionInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SquaringElement {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> conObj = (num) ->{
              System.out.println(num*num);
        };
        list.forEach(conObj);
    }
}
