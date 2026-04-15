//59. Develop a Java program to create and start a thread.

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class q59 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
