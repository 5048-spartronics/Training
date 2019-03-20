package app;

public class Automobile
{
    protected int milesPerGallon;
    protected String make;
    protected String model;
    protected int weight;
    protected int doors;

    public Automobile()
    {

    }
    public Automobile(String make, String model, int weight, int doors, int milesPerGallon)
    {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.doors = doors;
        this.milesPerGallon = milesPerGallon;
    }

    public void Start()
    {

    }
    public void Stop()
    {

    }
    public String getMake()
    {
        return make;
    }
    public void setMake(String value)
    {
        make = value;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String value)
    {
        model = value;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int value)
    {
        weight = value;
    }
    public void Print()
    {
        System.out.println("Auto: " + this.make + " " + this.model);
    }
}