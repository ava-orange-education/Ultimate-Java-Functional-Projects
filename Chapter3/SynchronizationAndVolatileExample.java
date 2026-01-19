public class SynchronizationAndVolatileExample {

    public static void main(String[] args) throws InterruptedException {

        // ----- Synchronized method & block demo -----
        SynchronizedCounter methodCounter = new SynchronizedCounter();
        BlockCounter blockCounter = new BlockCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                methodCounter.increment();
                blockCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                methodCounter.increment();
                blockCounter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Synchronized method count: " + methodCounter.getCount());
        System.out.println("Synchronized block count:  " + blockCounter.getCount());

        // ----- Volatile keyword demo -----
        SharedData sharedData = new SharedData();

        Thread worker = new Thread(() -> {
            System.out.println("Worker started, waiting for flag to become false...");
            while (sharedData.isFlag()) {
                // busy-wait until flag changes
            }
            System.out.println("Worker noticed flag is false, exiting.");
        });

        worker.start();

        Thread.sleep(500); // simulate some work
        System.out.println("Main thread updating flag to false");
        sharedData.updateFlag();
        worker.join();
    }
}

// synchronized method example
class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

// synchronized block example
class BlockCounter {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}

// volatile keyword example
class SharedData {
    private volatile boolean flag = true;

    public void updateFlag() {
        flag = false;
    }

    public boolean isFlag() {
        return flag;
    }
}
