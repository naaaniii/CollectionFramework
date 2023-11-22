package sec02_set.EX01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();

        //1. add(E element)
        hSet.add("a");
        hSet.add("b");
        hSet.add("a");
        System.out.println(hSet.toString()); //a, b prints instead of a, b, a

        //2. addAll (other set E)
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("b");
        hSet2.add("c");
        hSet2.addAll(hSet);
        System.out.println(hSet2);

        //3. remove(Object o)
        hSet2.remove("b");

        //4. clear
        hSet2.clear();
        System.out.println(hSet2.toString());
        //5.  isEmpty boolean to check if clear

        //6. contains(Object o)
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("a");
        hSet3.add("b");
        hSet3.add("c");
        System.out.println(hSet3.contains("b")); //true
        System.out.println(hSet3.contains("d")); //false

        //7. size()
        System.out.println(hSet3.size()); //3

        //8.
        Iterator<String> iterator = hSet3.iterator();
        while (iterator.hasNext()) { //3 data so it will run 3x
            System.out.println(iterator.next());
        }

        //9. toArray
        Object[] objArray = hSet3.toArray();
        System.out.println(Arrays.toString(objArray));

        //10-1. toArray(T[] t)
        String[] strArray1 = hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray1)); //[a,b,c]

        //10-2. toArray(T[] t)
        String[] strArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2)); //[a,b,c,null,null]



    }
}
