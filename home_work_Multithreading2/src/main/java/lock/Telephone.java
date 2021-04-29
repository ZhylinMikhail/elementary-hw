package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Telephone {
    Lock lock = new ReentrantLock();

    public void incomingCall() {
        lock.lock();
        System.out.println("incoming call..." + Thread.currentThread().getName());
        communication();
    }

    public void communication() {
        System.out.println("communication..." + Thread.currentThread().getName());
        endedCall();

    }

    public void endedCall() {
        System.out.println("ended call." + Thread.currentThread().getName());
        lock.unlock();

    }
}
