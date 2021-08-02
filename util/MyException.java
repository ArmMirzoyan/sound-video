package util;

public class MyException extends RuntimeException {

    public MyException() {

    }

    public MyException(String message) {
        super("My exception: file not found");
    }

    @Override
    public String toString() {
        return "MyException {"
                + "message = " + getMessage()
                + "} ";
    }

}
