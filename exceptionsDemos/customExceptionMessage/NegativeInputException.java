package softuni.exceptionsDemos.customExceptionMessage;

public class NegativeInputException extends Exception {
    private int num;

    public NegativeInputException(int num) {
        this.num = num;
    }

    @Override
    public String getMessage() {
        return num + " -> " + (-num);
    }
}
