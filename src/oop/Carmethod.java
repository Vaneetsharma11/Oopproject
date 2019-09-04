package oop;

public class Carmethod {

    public static void main (String[] args) {

        Car car1 = new Car("Altima", "Black", "2015", "Nissan",  "800", false, true);

        System.out.println(car1.getledScreen());
        System.out.println(car1.getName());


        Vehicle vehicle1 = new Vehicle("Altima", "Black", "2015", "Nissan", "800");
        System.out.println(vehicle1.getInfo());

        Vehicle vehicle2 = new Vehicle("Altima", "Black", "2015", "Nissan", "800", true, false);
        System.out.println(vehicle2.getInfo());

    }
}
