package p04_List_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        Collections.addAll(myList, 1,2,3,4,5);

        ListUtils lu = new ListUtils();

        System.out.println(lu.getMax(myList));
        System.out.println(lu.getMin(myList));
    }
}
