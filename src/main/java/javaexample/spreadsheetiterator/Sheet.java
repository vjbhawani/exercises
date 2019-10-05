package javaexample.spreadsheetiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sheet implements Iterable<Row> {
    List<Row> rows = new ArrayList<>();

    @Override
    public Iterator<Row> iterator() {
        return new SheetIterator(rows);
    }

    public List<Row> getRows() {
        return rows;
    }
}
