package functionInterface.consumer;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PrintReverceList {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        //Collections.sort(list, Comparator.reverseOrder());

        List<Integer> ReverceSorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Consumer<Integer> conObj = (num) ->{
            System.out.println(num);
        };
        ReverceSorted.forEach(conObj);

    }
}
