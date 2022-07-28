package BreakingThread_1;

import java.util.Scanner;

class Processors extends Thread{
    private boolean running = true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutDown(){
        running = false;
    }
}

public class App {
    public static void main(String[] args) {
        Processors processors = new Processors();

        processors.start();
        System.out.println("Tugmani bosing va cheksizlikni oldini oling!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processors.shutDown();
        System.out.println("Finished");
    }
}
