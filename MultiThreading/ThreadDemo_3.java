package Multithreading;

public class ThreadDemo_3 extends Thread {
    public static void main(String[] args) {
        ThreadDemo_3 obj=new ThreadDemo_3();
        obj.start();
        System.out.println(obj.getName());
        System.out.println(obj.getContextClassLoader());
        System.out.println("Norm_Priority:  "+obj.getPriority());
        System.out.println(obj.isAlive());
        System.out.println(obj.threadId());
        System.out.println("=======================");
        ThreadDemo_3 t=new ThreadDemo_3();

        t.start();
    }

    @Override
    public void run() {
        System.out.println("I am in Run method...............");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*i);
        }
    }
}
