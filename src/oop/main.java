package oop;

public class main {

    public static void main (String[] args) {

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.getName());
        vehicle.setName("Ludhiana");
        System.out.println(vehicle.getName());


        Vehicle vehicle2 = new Vehicle("Altima", "Black", "2015", "Nissan", "900");
        System.out.println(vehicle2.getColor());
        System.out.println(vehicle2.getColor());

        vehicle2.setColor("Green");
        System.out.println(vehicle2.getColor());
        System.out.println(vehicle2.getSpeed());


       Vehicle vehicle1 = new Vehicle("Altima", "Black", "2015", "Nissan", "900");
        System.out.println(vehicle1.getInfo());



    }
}






