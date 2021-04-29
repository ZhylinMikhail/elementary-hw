import entity.Car;
import entity.Driver;
import lombok.SneakyThrows;
import thread.CustomCallable;
import thread.CustomRunnable;
import thread.CustomThread;

import java.util.concurrent.FutureTask;


public class Main {

    @SneakyThrows
    public static void main(String[] args)  {
        CustomThread firstThread = new CustomThread();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread secondThread = new Thread(customRunnable);

        CustomCallable customCallable = new CustomCallable();
        FutureTask<String> task = new FutureTask<>(customCallable);
        Thread thirdThread = new Thread(task);



        firstThread.start();
//        firstThread.join();
        secondThread.start();
//        secondThread.join();
        thirdThread.start();
//        thirdThread.join();


//===========================================DeadLock===================================================================
//
//            Car car = new Car();
//            Driver secondClass = new Driver();
//
//            car.setDriver(secondClass);
//            secondClass.setCar(car);
//
//            Thread thread1 = new Thread(() -> System.out.println(car.getFromDriver()));
//            Thread thread2 = new Thread(() -> System.out.println(secondClass.getFromCar()));
//
//            thread1.start();
//            thread2.start();
    }
}