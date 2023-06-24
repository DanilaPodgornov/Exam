public class Main {
    public static void main(String[] args) throws MyException {
        /*try {
            System.out.println(4 / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Нельзя делить на нуль.");
        }*/
        int a = 0;
        try {
            if (a == 0) {
                throw new MyException("Error!");
            }
        } catch (MyException exception) {
            System.out.println(exception.getMessage());
        }
    }
}