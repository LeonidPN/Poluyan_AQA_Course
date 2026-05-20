package Lesson5;

public class MyArrayDataException extends NumberFormatException {
    private int row;
    private int column;

    public MyArrayDataException(int row, int column) {
        super("Can not parse element to Integer. Row: " + row + ". Column: " + column + ".");
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
