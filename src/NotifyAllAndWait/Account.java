package NotifyAllAndWait;

public class Account {
    int balance;

    public Account(int balance){
        this.balance = balance;
    }


    public synchronized void withdraw(int sum) throws InterruptedException {
        System.out.println("Hissobdan mablag' "+sum+" yechish kerak. " +
                Thread.currentThread().getName());
        while (sum > balance){
            System.out.println("Hissobda mablag' kam. ");
            System.out.println(Thread.currentThread().getName() + " kutyabdi");
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " hissobdan mablag' yechib oldi.");
        this.balance -= sum;
    }

    public synchronized void deposit(int dep){
        System.out.println(Thread.currentThread().getName() + " hissobga qo'shildi.");
        this.balance += dep;
        notify();
    }
}
