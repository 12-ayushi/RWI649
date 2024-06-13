package Multithreading;
// performing single task from single thread
public class ThreadDemo_2 implements Runnable{
    public static void main(String[] args) {// thrad 1
        ThreadDemo_2 t=new ThreadDemo_2();
        Thread th=new Thread(t);
        th.start();
    }

    @Override
    public void run() {
        System.out.println("mmmmmmm");
    }
}
