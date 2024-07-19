package functionInterface.ConsumerAndPredictor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
//print name is it's length is greater than 5
public class LargestString
{
    public static void main(String[] args){
        List<String> list = Arrays.asList("Kirti", "Aditi","Arundhati", "Krishna","Om", "Sai");

        Predicate<String> checkLength = (name)-> name.length()>=5;

        Consumer<String> OpName = (name)->{
            System.out.println(name);
        };

        list.stream()
                .filter(checkLength)
                .forEach(OpName);
    }
}
