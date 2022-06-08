package lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String[][] size) {

        super(String.valueOf(size));
    }

    public MyArraySizeException() {

    }
}
