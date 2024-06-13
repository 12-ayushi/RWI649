package Multithreading;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();
        t.start();
//        for (int i = 0; i < 200; i++) {
//            System.out.println(i);
//        }
    }

    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
        System.out.println("He");
    }
}
