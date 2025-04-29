# Garbage Collection in Java

Garbage collection (GC) is the process of automatically reclaiming memory used by objects that are no longer reachable in the program. Here’s how it works:

## 1. **Types of Garbage Collection**
   - **Serial Garbage Collector**: This is a single-threaded collector. It's ideal for single-threaded applications.
   - **Parallel Garbage Collector**: Uses multiple threads for GC tasks, suitable for multi-threaded applications.
   - **Concurrent Mark-Sweep (CMS)**: Minimizes pause times by performing marking and sweeping concurrently with application threads.
   - **G1 Garbage Collector**: A more modern and scalable collector designed for large heaps, dividing the heap into regions to improve GC performance.

## 2. **How Garbage Collection Works**
   - **Mark Phase**: GC identifies which objects are still reachable and in use.
   - **Sweep Phase**: Unreachable objects are reclaimed and their memory is freed.
   - **Compact Phase**: The remaining live objects are compacted to minimize fragmentation.

## 3. **GC Tuning**
   - **Heap Size**: Setting the right heap size ensures that GC can work effectively without frequent pauses. Too large a heap may increase GC pause times, while too small a heap can cause frequent GC invocations.
   - **GC Algorithms**: Choosing the right GC algorithm based on your application’s needs can improve performance.

## Conclusion
   - Tuning GC properly can have a significant impact on performance. By monitoring GC logs and adjusting heap sizes or choosing the right GC algorithm, you can minimize pauses and optimize memory usage.
