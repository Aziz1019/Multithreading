package NotifyAllAndWait;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    account.withdraw(300000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Komunal");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(500000);
            }
        }, "Oylik");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
