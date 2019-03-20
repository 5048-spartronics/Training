package app;

public class Truck extends Automobile
{
    protected int towingCapacity;
    public Truck()
    {

    }
    public Truck(int towingCapacity, String make, String model, int weight, int doors, int milesPerGallon){
        super( make,  model,  weight,  doors, milesPerGallon);
        this.towingCapacity = towingCapacity;

    }

    public int getTowingCapacity()
    {
        return towingCapacity;
    }
    public void setTowingCapacity(int value)
    {
        towingCapacity = value;
    }
    public void Print()
    {
        System.out.println("Truck: " + this.make + " " + this.model);
    }
}