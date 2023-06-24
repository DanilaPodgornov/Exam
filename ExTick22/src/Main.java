import java.io.*;

public class Main {
    public static void main(String[] args) {

        String myString = "3";

        try {
            Saver saver = new Saver(myString);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("config.out"));
            oos.writeObject(saver);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("config.out"));
            Saver outSaver = (Saver) ois.readObject();
            ois.close();
            System.out.println(outSaver.value);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}