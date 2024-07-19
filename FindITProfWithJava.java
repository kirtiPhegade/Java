package functionInterface.Predicate;

import functionInterface.ConsumerAndPredictor.People;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class FindITProfWithJava {

    public static void main(String[] args){
        List<People> user = new ArrayList<>();
        user.add(new People("Airti",24,"IT","Java"));
        user.add(new People("Suyog",20,"AutoMobile","Desinging"));
        user.add(new People("Rani",45,"Data Engineer","Plsql"));
        user.add(new People("Mohit",75,"IT","Java"));
        user.add(new People("Vishal",57,"IT","Java"));
        user.add(new People("Aohit",35,"IT","Python"));
        user.add(new People("Aishal",27,"IT","Golang"));

        BiPredicate<String,String> itWithJava = (p,s) -> p.equals("IT") && s.equals("Java");
        for(int i=0;i<user.size();i++){
            if(itWithJava.test(user.get(i).getPro(), user.get(i).getSkill())){
                System.out.println(user.get(i).getName()+" "+user.get(i).getAge()+" "+user.get(i).getPro()+" "+user.get(i).getSkill());
            }
        }
    }
}
