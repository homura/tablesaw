package tech.tablesaw.io.string;

import org.junit.jupiter.api.Test;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataFramePrinterTest {

    @Test
    public void printNull() {
        DoubleColumn col = DoubleColumn.create("testCol");
        col.append(5.0);
        col.appendCell(null);
        col.append(3.0);
        Table table = Table.create("nullCellTable", col);
        String out = table.print();
        assertTrue(out.contains("          "));
    }

}
