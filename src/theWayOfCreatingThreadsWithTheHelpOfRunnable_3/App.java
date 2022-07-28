package theWayOfCreatingThreadsWithTheHelpOfRunnable_3;

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello " + i + Thread.currentThread().getName());
        }
    }
}

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner());
        t1.start();
    }
}
