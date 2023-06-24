import java.io.Serializable;

public class Saver implements Serializable {
    String value;
    Saver(String value) {
        this.value = value;
    }
}
