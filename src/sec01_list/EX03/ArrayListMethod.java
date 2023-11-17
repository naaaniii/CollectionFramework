package sec01_list.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<Integer>();


        //1. add(E element)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1.toString());  //override
        System.out.println(aList1); // same result

        //2. add(int index, E element)
        aList1.add(1,7); //other elements are pushed back
        System.out.println(aList1);

        //3. addAll (another list)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(5);
        aList2.addAll(aList1);
        System.out.println(aList2);

        //4. addAll(int index, collection)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(3);
        aList3.add(4);
        aList3.addAll(1, aList3);
        System.out.println(aList3);

        //5. set(int index, E element
        aList3.set(1,5);
        System.out.println(aList3);
        // if index does not exist, IndexOutOfBoundsException

        //6. remove(int index)
        aList3.remove(2);

        //7. remove(Object o)
      //r  aList3.remove(new Integer(3));
        System.out.println(aList3);

        //8. clear
        aList3.clear();
        System.out.println(aList3); //[]

        //9. isEmpty()
        System.out.println(aList3.isEmpty()); //boolean (true)

        //10. size
        System.out.println(aList2.size());

        //11. get(int index)
        System.out.println(aList2.get(2));

        //12. toArray() List -> Array
        Object[] object = aList2.toArray();
        System.out.println(Arrays.toString(object));

        //13. toArray(T[] t)   ->  T[]
        Integer[] integer1 = aList2.toArray(new Integer[10]);
        System.out.println(Arrays.toString(integer1));




    }
}
