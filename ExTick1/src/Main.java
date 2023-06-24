public class Main {
    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        //thread.setDaemon(true);
        thread.start();
        /*try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        MyThread myThread = new MyThread();
        //myThread.setDaemon(true);
        myThread.start();
        /*try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");

            if (i > 5) {
                thread.interrupt();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}