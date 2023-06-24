import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt", false);
            fileWriter.write("Hello, world!");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("test.txt");
            StringBuilder result = new StringBuilder();
            int c;
            char[] buf = new char[4];
            while ((c = fileReader.read(buf)) > 0) {
                if (c < 4) {
                    buf = Arrays.copyOf(buf, c);
                }
                result.append(String.valueOf(buf));
            }
            System.out.println(result);
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}