package Multithreading;

public class DaemonThreadDemo extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread");
        }else {
            System.out.println("threfg");
        }
        System.out.println("child");
    }

    public static void main(String[] args) {
        System.out.println("makoc");
        DaemonThreadDemo t=new DaemonThreadDemo();

        t.setDaemon(true);// we create daemon thread
        t.start();

    }
}
