package app;

public class Car extends Automobile
{
    private CarType type;
    public Car()
    {

    }
    public Car(CarType type,String make, String model, int weight, int doors, int milesPerGallon)
    {
        super( make,  model,  weight,  doors,  milesPerGallon);
        this.type = type;
    }
    public CarType getType()
    {
        return type;
    }
    public void setType(CarType value)
    {
        this.type = value;
    }
    public void Start()
    {

    }
    public void Stop()
    {

    }
    public void Print()
    {
        System.out.println("Car: " + this.make + " " + this.model);
    }

}