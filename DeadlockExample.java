package cuncurrency;

pclass Resource {
    synchronized void methodA(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing methodA");
        r.methodB(this);
    }
    
    synchronized void methodB(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing methodB");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.methodA(r2));
        Thread t2 = new Thread(() -> r2.methodA(r1));

        t1.start();
        t2.start();
    }
}
