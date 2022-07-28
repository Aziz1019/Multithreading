package NotifyAllAndWait;

public class Account {
    int balance;

    public Account(int balance){
        this.balance = balance;
    }


    public synchronized void withdraw(int sum){
        System.out.println("");
    }

    public synchronized void deposit(int dep){

    }
}
