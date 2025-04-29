package cuncurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
    private static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) {
        atomicCount.incrementAndGet();
        System.out.println("Atomic Count: " + atomicCount.get());
    }
}

}
