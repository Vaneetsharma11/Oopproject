package oop;

public class Vehicle {

    private String name = "";
    private String color = "";
    private String model = "";
    private String company = "";
    private String engine = "800";

    public Vehicle (String altima, String black, String s, String nissan, String s1, boolean b, boolean b1) {
    }

    public Vehicle (String name, String color, String model, String company, String engine) {

        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;

    }

    public Vehicle () {

    }


    // Setter
    public void setName (String name) {
        this.name = name;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    public void setEngine (String engine) {
        this.engine = engine;
    }

    // Getter

    public String getName () {
        return this.name;
    }

    public String getColor () {
        return this.color;
    }

    public String getModel () {
        return this.model;
    }

    public String getCompany () {
        return this.company;
    }

    private String getEngine () {
        return this.engine;
    }

    public int getSpeed () {
        String a = getEngine();
        if (a == "900") {
            return 90;
        } else {
            return 120;

        }
    }

    public String getInfo () {
        return "This is a Vehicle";

    }
}









