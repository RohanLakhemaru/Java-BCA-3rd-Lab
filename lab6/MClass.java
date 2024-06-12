package lab6;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    public int getCount() {
        return count;
    }
}
class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MClass {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterThread th1 = new CounterThread(counter);
        CounterThread th2 = new CounterThread(counter);

        th1.setName("Thread 1");
        th2.setName("Thread 2");

        th1.start();
        th2.start();
    }
}

