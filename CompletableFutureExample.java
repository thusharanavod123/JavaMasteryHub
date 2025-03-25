package cuncurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> 
            System.out.println("Running async task"));

        future.join();
    }
}

