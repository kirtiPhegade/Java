package Java.Telusko_Java_Assignmnet.Assignment_1;

import java.util.*;

class Car {
    private String name;
    private String model;
    private String color;

    Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    void setName(String name) {
        this.name = name;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setColor(String color) {
        this.color = color;
    }

    void DisplayData(){
        System.out.println("Car Information:");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

public class CarDetails {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Car c = new Car("Toyato", "Camry", "Red");
        c.DisplayData();
        c.setColor("Blue");
        c.DisplayData();
    }
}
// Output
// Car Information:
// Name: Toyato
// Model: Camry
// Color: Red
// Car Information:
// Name: Toyato
// Model: Camry
// Color: Blue
