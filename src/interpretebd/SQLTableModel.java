/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretebd;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jurgenn
 */
public class SQLTableModel extends AbstractTableModel {

    private ArrayList<ArrayList<String>> data;
    private String[] columnNames;

    public SQLTableModel(ArrayList<ArrayList<String>> data, String[] colNames) {
        this.data = data;
        this.columnNames = colNames;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        int intColCount = 0;
        if (getRowCount() != 0) {
            intColCount = data.get(0).size();
        }
        return intColCount ;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex).get(columnIndex);
    }

}
