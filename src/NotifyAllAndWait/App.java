package NotifyAllAndWait;

public class App {
    public static void main(String[] args) {
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
    }
}
