package javaexample.spreadsheetiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Workbook implements Iterable<Sheet> {
    private List<Sheet> sheets = new ArrayList();

    @Override
    public Iterator<Sheet> iterator() {
        return new WorkbookIterator(sheets);
    }

    public List<Sheet> getSheets() {
        return sheets;
    }

    public static void main(String[] args) {
       Cell cellA1 = new Cell("A1");
       Cell cellB1 = new Cell("B1");

       Row row1 = new Row();
       row1.getCells().add(cellA1);
       row1.getCells().add(cellB1);

        Cell cellA2 = new Cell("A2");
        Cell cellB2 = new Cell("B2");

        Row row2 = new Row();
        row2.getCells().add(cellA2);
        row2.getCells().add(cellB2);

       Sheet sheet1 = new Sheet();
       sheet1.getRows().add(row1);
       sheet1.getRows().add(row2);


        Sheet sheet2 = new Sheet();
        sheet2.getRows().add(row1);
        sheet2.getRows().add(row2);

       Workbook workbook = new Workbook();
       workbook.getSheets().add(sheet1);

        workbook.forEach(
                rows -> rows.forEach(
                        cells -> cells.forEach(
                                c -> System.out.println(c.getValue()))));
    }
}
