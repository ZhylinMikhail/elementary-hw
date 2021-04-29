import lock.Telephone;
import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    private static AtomicInteger atomicInteger = new AtomicInteger(20000);

    @SneakyThrows
    public static void main(String[] args) {
//        firstThread();
//        secondThread();
//    }
//
//    private static AtomicInteger firstThread() {
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread();
//            atomicInteger.decrementAndGet();
//        }
//        System.out.println("firstThread " + atomicInteger);
//        return atomicInteger;
//    }
//    private static AtomicInteger secondThread() {
//        for (int i = 0; i < 10000; i++) {
//            Thread thread = new Thread();
//            atomicInteger.decrementAndGet();
//        }
//        System.out.println("secondThread " + atomicInteger);
//        return atomicInteger;
//    }

//    ========================================== Lock ==================================================================
        Telephone telephone = new Telephone();
        Thread one = new Thread(telephone::incomingCall);
        Thread two = new Thread(telephone::incomingCall);
        Thread three = new Thread(telephone::incomingCall);
        one.start();
        two.start();
        three.start();
    }
}
