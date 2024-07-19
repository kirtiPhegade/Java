package functionInterface.ConsumerAndPredictor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindPeople {

    public static void main(String[] args){

        List<People> user = new ArrayList<>();
        user.add(new People("Airti",24,"IT","Java"));
        user.add(new People("Suyog",20,"AutoMobile","Desinging"));
        user.add(new People("Rani",45,"Data Engineer","Plsql"));
        user.add(new People("Mohit",75,"IT","Java"));
        user.add(new People("Vishal",57,"IT","Java"));
        user.add(new People("Aohit",35,"IT","Python"));
        user.add(new People("Aishal",27,"IT","Golang"));

        Consumer<People> printAll = (p)->System.out.println(p.getName()+" "+p.getAge());
//        user.forEach(printAll);

        Predicate<People> findAdult = (p)->p.getAge()>25;
        Predicate<People> nameStartWithA = (p)->p.getName().startsWith("A");

        user.stream()
                .filter(findAdult.or(nameStartWithA))
                .forEach(printAll);

//        System.out.println("__________________________________");
//        System.out.println("People who's name start with A");
//
//        user.stream()
//                .filter(nameStartWithA)
//                .forEach(printAll);

    }
}
