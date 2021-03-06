package p04_List_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T firstElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (firstElement.compareTo(list.get(i)) > 0){
                firstElement = list.get(i);
            }
        }
        return firstElement;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        T firstElement = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (firstElement.compareTo(list.get(i)) < 0){
                firstElement = list.get(i);
            }
        }
        return firstElement;
    }

    public static  List<Integer> getNullIndices(List<?> list){
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                indexList.add(i);
            }
        }
        return indexList;
    }

    public static <T> void flatten(List<? super T> dest, List<List<? extends T>> src){

        for (List<? extends T> innerList: src) {
            dest.addAll(innerList);
        }
    }

    public static  <T> void addAll(List<? super T> dest, List<? extends T> src){

        dest.addAll(src);
    }
}
