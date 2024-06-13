package Multithreading;


public class ThreadDemo_4 extends Thread  {

    public static void main(String[] args) {
        ThreadDemo_4 obj=new ThreadDemo_4();
        obj.start();
    }


    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }
}
