package lab6;

class BirdThread extends Thread {
    private String[] birds = {"Sparrow", "Parrot", "Eagle", "Owl", "Peacock"};

    @Override
    public void run() {
        try {
            for (String bird : birds) {
                System.out.println("Bird: " + bird);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AnimalThread extends Thread {
    private String[] animals = {"Lion", "Elephant", "Tiger", "Giraffe", "Zebra"};

    @Override
    public void run() {
        try {
            for (String animal : animals) {
                System.out.println("Animal: " + animal);
                Thread.sleep(1500); // Sleep for 1.5 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        BirdThread birdThread = new BirdThread();
        AnimalThread animalThread = new AnimalThread();

        birdThread.start();
        animalThread.start();
    }
}
