package functionInterface.ConsumerAndPredictor;

import functionInterface.consumer.NumToStirng;

public class People {

    private String name;
    private int age;
    private String pro;
    private String skill;

    public People(String n, int a, String p, String s){
        this.name = n;
        this.age = a;
        this.pro = p;
        this.skill=s;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
