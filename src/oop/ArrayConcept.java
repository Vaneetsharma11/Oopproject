package oop;

public class ArrayConcept {
    public static void main (String[] args) {

        /*Array means to store similar data type values in a array variable
        int array:
        lowest bound/index = 0
        upper bound/index = n-1 (n is the size of array
        one dimensional array

        Disadvantages of array is
        1) size is fixed --static array --To solve this problem --we use Collections, Array list , Hashtable called Dynamics array
        2) stores only similar data types --To solve-- we use object array
        */

        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[3]);
        System.out.println(i[0]);

       // System.out.println(i[4]); ArrayIndexOutOfBoundsException

        System.out.println(i.length); // length of array

        //print all the values of array : use for loop

        for(int j = 0; j<i.length; j++) {
            System.out.println(i[j]);
        }

        //double array
        double d[] = new double[3];
        d[0] = 11.33;
        d[1] = 12.44;
        d[2] = 14.44;

        System.out.println(d[1]);

        // char array
        char c[] = new char[3];
        c[0] = 'D';
        c[1] = 'N';
        c[2] = 'A';

        System.out.println(c[1]);

        //Boolean array

        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        //String array

        String s[] = new String[3];
        s[0] = "Hello";
        s[1] = "World";
        s[2] = "Wide";

        System.out.println(s.length);

        // Object Array
        // It is used to store data types values

        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] = 25;
        ob[2] = 12.33;
        ob[3] = 'M';
        ob[4] = "1/1/1990";
        ob[5] = "London";

        System.out.println(ob[4]);
        System.out.println(ob.length);









    }
}
