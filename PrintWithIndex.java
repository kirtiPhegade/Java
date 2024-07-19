package functionInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class PrintWithIndex {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        BiConsumer<Integer, Integer> conObj = (num, index) -> System.out.println("Index of Number " + num + " is " + index);
        // create BiConsumer object and then pass number and index value through loop
        for (int i = 0; i < list.size(); i++) {
            conObj.accept(list.get(i), i);
        }
    }

}
