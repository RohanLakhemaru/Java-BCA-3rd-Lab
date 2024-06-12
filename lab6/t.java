package lab6;

class FactorsThread extends Thread {
    private int number;
    private long interval;

    public FactorsThread(int number, long interval) {
        this.number = number;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("Factor of " + number + ": " + i);
                    Thread.sleep(interval);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FactorsThread thread1 = new FactorsThread(20, 1000); // 1-second interval
        FactorsThread thread2 = new FactorsThread(25, 1500); // 1.5-second interval

        thread1.start();
        thread2.start();
    }
}

