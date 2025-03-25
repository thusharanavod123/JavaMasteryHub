package cuncurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Runnable task = () -> System.out.println("Executing task " + Thread.currentThread().getName());

        executor.submit(task);
        executor.submit(task);
        executor.shutdown();
    }
}
