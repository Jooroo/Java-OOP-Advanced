package p01_Jar_of_T;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {

    private Deque<T> jarContent;

    public Jar() {
        this.jarContent = new ArrayDeque<>();
    }

    public void add (T element) {
        jarContent.push(element);
    }

    public T remove (){
        return this.jarContent.pop();
    }
}
