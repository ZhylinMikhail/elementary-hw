package thread;

import lombok.Data;
import service.ServiceThread;

@Data
public class CustomThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("CustomThread...");
        for (int i = 0; i < 1000; i++) {
            ServiceThread.getNameCountThread();
        }
    }
}
