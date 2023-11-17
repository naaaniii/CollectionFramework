package sec01_list.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
    public static void main(String[] args) {

        //1. array
        String[] array = new String[] {"a", "b", "c", "d", "e", "f"};

        array[2] = null;
        array[5] = null;

        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println();

        //2. List
        List<String> aList = new ArrayList<>();
        System.out.println(aList.size()); //count of data
        aList.add("a");
        aList.add("b");
        aList.add("c");
        aList.add("d");
        aList.add("e");
        System.out.println(aList);
        System.out.println(aList.size());

        aList.remove("c");
        aList.remove(2);
        System.out.println(aList);
        System.out.println(aList.size());

    }
}
