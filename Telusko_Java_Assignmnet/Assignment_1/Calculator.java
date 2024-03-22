package Java.Telusko_Java_Assignmnet.Assignment_1;

import java.util.Scanner;

/*Problem Statement: create a java program that functions as a basic calculator*/
class Oprations{
    String opration="";
    int num1,num2;
    Oprations(String op,int num1, int num2){
        this.opration=op;
        this.num1=num1;
        this.num2=num2;
    }
    void goToOpretions(){
        if(opration.equals("add")){
            add(num1,num2);
        }else if(opration.equals("subtract")){
            subtract(num1,num2);
        }else if(opration.equals("multiply")){
            multiply(num1,num2);
        }else if(opration.equals("division")){
            division(num1,num2);
        }else{
            System.out.println("Please select correct optations");
        }
    }
    
    void add(int num1,int num2){
        int n = num1+num2;
        System.out.println(num1+"+"+num2+"="+n);
    }
    void subtract(int num1,int num2){
        int n = num1-num2;
        System.out.println(num1+"-"+num2+"="+n);
    }
    void multiply(int num1,int num2){
        int n = num1*num2;
        System.out.println(num1+"*"+num2+"="+n);
    }
    void division(int num1,int num2){
        int n = num1/num2;
        System.out.println(num1+"/"+num2+"="+n);
    }
}
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Which Operation you want to perform"+"\n"+"Add"+"\n"+"Subtract"+"\n"+"Multiply"+"\n"+"Division");
        System.out.println("Select any one");
        String oren= sc.nextLine();
        Oprations op = new Oprations(oren,num1,num2);
        op.goToOpretions();
    }
}
