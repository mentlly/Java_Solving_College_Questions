//62. Develop a multithreaded Java program with two threads. One thread generates
//evennumbersfrom1 to 100 and another thread generates odd numbers from1 to
//100. Ensure that the threads do not interfere.

class Number {
    int n = 1;
    synchronized void printOdd() {
        while(n <= 100) {
            if(n%2==0) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            } else {
                System.out.println("Odd-thread : "+n++);
                notify();
            }
        }
    }
    synchronized void printEven() {
        while(n <= 100) {
            if(n%2!=0){
                try {
                    wait();
                } catch (InterruptedException e) {}
            } else {
                System.out.println("Even-thread: "+n++);
                notify();
            }
        }
    }
} 

public class q62 {
    public static void main(String[] args) {
        Number numPrint = new Number();
        new Thread(() -> numPrint.printEven()).start();
        new Thread(() -> numPrint.printOdd()).start();
    }
}