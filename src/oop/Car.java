package oop;

public class Car extends Vehicle {
    private boolean powerSteering = false;
    private boolean ledScreen = true;


    public Car (String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen) {
        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }

    //setter
    public void setpowerSteering (boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public void setledScreenr (boolean ledScreen) {
        this.ledScreen = ledScreen;
    }
    //getter

    public boolean getpowerSteering () {
        return this.powerSteering;
    }

    public boolean getledScreen () {
        return this.ledScreen;
    }

    // Overriding

     public String getName() {
    return "Name of your vehicle is:" + super.getName();
     }


     public String getinfo()  {
        return "This is a Car";

    }
}

