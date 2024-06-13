package Multithreading;

public class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println("child");
        System.out.println("priority"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("main thread priority"+Thread.currentThread());
        ThreadPriorityDemo t=new ThreadPriorityDemo();
        t.setPriority(10);
        t.start();
    }
}
