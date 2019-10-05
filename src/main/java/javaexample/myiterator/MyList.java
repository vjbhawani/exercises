package javaexample.myiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<T> implements Iterable<T> {
    private List<T> list = new ArrayList<>();

    public void add(T val) {
        list.add(val);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<T>(this.list);
    }
}
