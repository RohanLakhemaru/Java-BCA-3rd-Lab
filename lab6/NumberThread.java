package lab6;


    public class NumberThread extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        public static void main(String[] args) {
            NumberThread thread = new NumberThread();
            thread.start();
        }
    }
    

