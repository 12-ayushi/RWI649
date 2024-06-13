package Multithreading;

public class ThreadByRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadByRunnable obj=new ThreadByRunnable();
        Thread ob=new Thread(obj);
        ob.start();

    }

    @Override
    public void run() {
        System.out.println("Thread create by Runnable");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+1);
        }
    }
}
