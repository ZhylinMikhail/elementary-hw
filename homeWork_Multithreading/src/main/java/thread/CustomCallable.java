package thread;

import lombok.Data;
import service.ServiceThread;

import java.util.concurrent.Callable;
@Data
public class CustomCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName("Callable...");
        String result = "Callable...";
        for (int i = 0; i < 1000; i++) {
            ServiceThread.getNameCountThread();
        }
        return result;
    }
}

