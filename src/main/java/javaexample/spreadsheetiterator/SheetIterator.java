package javaexample.spreadsheetiterator;

import java.util.Iterator;
import java.util.List;

public class SheetIterator implements Iterator<Row> {
    private final List<Row> rows;
    private int ci = 0;

    public SheetIterator(List<Row> rows) {
        this.rows = rows;
    }

    @Override
    public boolean hasNext() {
        return ci < rows.size();
    }

    @Override
    public Row next() {
        return rows.get(ci++);
    }
}
