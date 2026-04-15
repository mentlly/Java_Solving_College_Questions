// 64. Develop a thread-based railway reservation system using Java where multiple
// users (threads) try to book train tickets simultaneously, ensuring proper
// synchronization to prevent overbooking.

import java.util.Scanner;

class TrainTicket {
    boolean selected = false;
    synchronized void bookingTicket() {
        if(selected) {
            try {
                System.out.println(Thread.currentThread()+"wait someone else booking");
                wait();
            } catch (InterruptedException e) {
            }
        } 
        if(!selected) {
            selected = true;
            notify();
            Scanner sc = new Scanner(System.in);
            System.out.print(Thread.currentThread()+"purchase confirm(y/n): ");
            String ans = sc.nextLine();
            if(ans.contentEquals("y")) {
                System.out.println(Thread.currentThread()+"Booked");
            } else {
                System.out.println(Thread.currentThread()+"Booking cancel");
                selected = false;
                notify();
            }
        }
    }
} 

public class q64 {
    public static void main(String[] args) {
        TrainTicket tt = new TrainTicket();
        new Thread(() -> tt.bookingTicket(), "sam").start();
        new Thread(() -> tt.bookingTicket(), "shreya").start();
    }
}
