package Lesson5;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Array's dimensions do not match the specified dimensions (4х4)");
    }
}
