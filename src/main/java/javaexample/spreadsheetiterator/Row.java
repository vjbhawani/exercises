package javaexample.spreadsheetiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Row implements Iterable<Cell> {
    List<Cell> cells = new ArrayList<>();

    @Override
    public Iterator<Cell> iterator() {
        return new RowIterator(cells);
    }

    public List<Cell> getCells() {
        return cells;
    }
}
