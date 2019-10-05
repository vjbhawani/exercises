package javaexample.spreadsheetiterator;

import java.util.Iterator;
import java.util.List;

public class RowIterator implements Iterator<Cell> {
    private final List<Cell> cells;
    private int currentIndex = 0;

    public RowIterator(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < cells.size();
    }

    @Override
    public Cell next() {
        return cells.get(currentIndex++);
    }
}
