package sec01_list.EX02;

import java.util.*;

public class CreateListObject {
    public static void main(String[] args) {

        //different ways of making lists
        //1. List 구현클래스의 생성자를 사용하여 객체 생성
        List<Integer> aList1 = new ArrayList<>();
        List<Integer> aList2 = new ArrayList<>(30); //capacity is different from size

        List<Integer> aList3 = new Vector<>();
        List<Integer> aList4 = new Vector<>(30);

        List<Integer> aList5 = new LinkedList<>();
        //List<Integer> aList6 = new LinkedList<>(30); --setting up a capacity is unavailable

        //2. Arrays 클래스의 정적 메소드 활용 (데이터의 크기를 바꿀 수 없음)

        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("hello", "world");
        aList7.set(1,7);
        aList8.set(1, "java");  // set(index, element)
        //aList7.add(2); --error
        //aList7.remove(2); --error

        System.out.println(aList7);
        System.out.println(aList8);




    }
}
