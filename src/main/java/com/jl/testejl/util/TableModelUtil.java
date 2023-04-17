/*
 * IdealCODE 2021
 */
package com.jl.testejl.util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Francisco Vieira
 */
public final class TableModelUtil extends AbstractTableModel {

    private ArrayList rows;
    private String[] cols;

    public TableModelUtil() {

    }

    public TableModelUtil(ArrayList rows, String[] cols) {
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] row = (Object[]) this.getRows().get(rowIndex);
        return row[columnIndex];
    }

    public ArrayList getRows() {
        return rows;
    }

    public void setRows(ArrayList rows) {
        this.rows = rows;
    }

    public String[] getCols() {
        return cols;
    }

    public void setCols(String[] cols) {
        this.cols = cols;
    }

    @Override
    public String getColumnName(int count) {
        return cols[count];
    }

}
