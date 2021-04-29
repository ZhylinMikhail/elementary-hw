package thread;

import lombok.Data;
import service.ServiceThread;

@Data
public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Runnable...");
        for (int i = 0; i < 1000; i++) {
            ServiceThread.getNameCountThread();
        }
    }
}
