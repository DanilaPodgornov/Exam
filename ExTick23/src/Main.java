import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        GenericInterface<Integer> squareArea = (side) -> side * side;
        GenericInterface<String> greeting = (name) -> "Hello, " + name + "!";

        System.out.println("Square Area = " + squareArea.meth(4));
        System.out.println(greeting.meth("John"));

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            numbers.add(i);
        }

        numbers.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
    }
}