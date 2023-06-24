/**
 * Способ 1
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from 2 thread");
            if (Thread.interrupted()) {
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                return;
            }
        }
    }
}
