public class MyException extends Exception {
    String message;
    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        //return super.getMessage();
        return message;
    }
}
