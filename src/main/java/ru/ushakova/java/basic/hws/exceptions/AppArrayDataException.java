package ru.ushakova.java.basic.hws.exceptions;

public class AppArrayDataException extends AbstractException {
    protected String arrayValue;
    protected int i;
    protected int j;

    public AppArrayDataException(String[][] array, int i, int j) {
        super("\nОшибка преобразования строки в число: " + "ячейка [" + i + "," + j + "] со значением " + array[i][j]);
        this.i = i;
        this.j = j;
        this.arrayValue = array[i][j];
    }

    public Object getArrayValue() {
        return arrayValue;
    }

}
