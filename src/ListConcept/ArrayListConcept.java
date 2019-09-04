package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main (String[] args) {

        int a[] = new int[3]; //static array size is fixed
      /* Properties of Arraylist
       can contain duplicate values or elements
       maintain insertion order means like in order 0 to 5 */

        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);

        System.out.println(ar.size());

    }
}
