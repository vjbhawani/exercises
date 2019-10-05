package javaexample.myiterator;

import java.util.Iterator;
import java.util.List;

public class MyListIterator<T> implements Iterator<T> {
    private final List<T> mylist;
    private int currentIndex = 0;

    public MyListIterator(List<T> list) {
        this.mylist = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < this.mylist.size();
    }

    @Override
    public T next() {
        return this.mylist.get(currentIndex++);
    }


}
