public class ExtendThreadExample {

    // Thread subclass
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running...");
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create thread instance
        thread.start();                   // Starts the thread, calls run()
    }
}
