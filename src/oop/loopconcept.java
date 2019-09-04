package oop;

public class loopconcept {


    public static void main (String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        //While loop
        // Dis-advantages of while loop is : it will generate infinite loop if u dont give incremental or decremental part
        //Print 1 to 10

        int i = 1; //Initialization
        while (i <= 10) {  //Conditional
            System.out.println(i);
            i = i + 1; // Incremental/Decremental


        }

        //For loop
        //Print 1 to 10

        for (int j = 1; j <= 10; j++) {  // Initialization, Conditional, Incremental
            System.out.println(j);
        }

        //Print 10 to 1
// k means k = k-1

        for (int k = 10; k >= -10; k--) {
            System.out.println(k);
        }


    }


}