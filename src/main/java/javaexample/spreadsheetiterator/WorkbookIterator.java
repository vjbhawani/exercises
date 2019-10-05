package javaexample.spreadsheetiterator;

import java.util.Iterator;
import java.util.List;

public class WorkbookIterator implements Iterator<Sheet> {
    private final List<Sheet> sheets;
    private int ci = 0;

    public WorkbookIterator(List<Sheet> sheets) {
        this.sheets = sheets;
    }

    @Override
    public boolean hasNext() {
        return ci < sheets.size();
    }

    @Override
    public Sheet next() {
        return sheets.get(ci++);
    }
}
