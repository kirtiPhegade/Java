package Java.Telusko_Java_Assignmnet.Assignment_1;

//create program to calculate simple interest rate
import java.util.*;

class calculate {
    private double principal;
    private double rate;
    private double time;

    calculate(double p, double r, double t) {
        this.principal = p;
        this.rate = r;
        this.time = t;
    }

    public double calSI() {
        return (principal * rate * time) / 100;
    }
}

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double p = sc.nextDouble();
            double r = sc.nextDouble();
            double t = sc.nextDouble();
            calculate c = new calculate(p, r, t);
            double simpleInterest = c.calSI();
            System.out.println(simpleInterest);
        }

    }

}
/*
 * output
 * 1000.0
 * 5.0
 * 3.0
 * 150.0
 */
