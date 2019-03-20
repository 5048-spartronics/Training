package app;


import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Automobile auto = new Automobile();
        Truck myTruck = new Truck(500,"Dodge","Ram",200, 4,25);
        Truck anotherTruck = new Truck(250, "Toyota", "Tacoma", 200, 4,30);
        Car myCar = new Car(CarType.Family, "Honda", "Acord", 150, 4, 35);
        List<Automobile> myTrucks = new ArrayList<Automobile>();
        Automobile[] autos = {(Automobile)myTruck, (Automobile)anotherTruck, (Automobile)myCar};

        myTrucks.add((Automobile)myTruck);
        myTrucks.add((Automobile)anotherTruck);


        for(Automobile t: autos)
        {
            t.Print();
        }

    }
    public static void PrintTruck(Truck t)
    {
        System.out.println(t.make + " " + t.model);
    }
}