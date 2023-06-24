public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                break;
        }

        switch (b) {
            case 1 -> {
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("2");
            }
            default -> {
                System.out.println("default");
            }
        }

        //тернарный оператор
        int c = a > b ? a:b;
        System.out.println("c = " + c);
    }
}