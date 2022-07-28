package FourDifferentThreadsRunningTheSame_2;

class Runner extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello " + i + " " + Thread.currentThread().getName());
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        Runner runner4 = new Runner();
        runner.start();
        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();
    }
}
