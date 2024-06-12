package lab6;
class NumberThread extends Thread {
    private int start;
    private int end;
    private int step;

    public NumberThread(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = start; i != end; i += step) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Sleep for 0.1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ManClass {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread(1, 51, 1); // 1 to 50
        NumberThread t2 = new NumberThread(100, 49, -1); // 100 to 50

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        // Set priority
        t1.setPriority(Thread.MAX_PRIORITY); // Maximum priority
        t2.setPriority(Thread.MIN_PRIORITY); // Minimum priority

        t1.start();
        t2.start();
    }
}
