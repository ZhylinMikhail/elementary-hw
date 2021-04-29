package service;


public class ServiceThread {
    public static int count;

    public static synchronized int getNameCountThread() {
        synchronized (ServiceThread.class) {

            System.out.println("name thread " + Thread.currentThread().getName() + "count = " + count++);

            return count;
        }
    }
}