package AsliEngineering.ConcurrencyInDepth.L5_WriteConcurrentThread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth.L5_WriteConcurrentThread
 * <p>
 * User: piyushbajaj
 * Date: 19/08/23
 * Time: 8:18 am
 */
public class ConcurrentQueue {
    Queue<Integer> queue = new LinkedList<>();

    void enqueue(int item) {
        queue.add(item);
    }

    int dequeue() {
        if (queue.size() == 0) {
            System.out.println("Cannot dequeue from empty queue");
            return -1;
        }

        return queue.remove();
    }

    public static void main(String[] args) {
        ConcurrentQueue concurrentQueue = new ConcurrentQueue();

        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            concurrentQueue.enqueue(random.nextInt());
        }

        concurrentQueue.enqueue(1);
        concurrentQueue.enqueue(2);
        concurrentQueue.enqueue(3);

        System.out.println(concurrentQueue.dequeue());
        System.out.println(concurrentQueue.dequeue());
        System.out.println(concurrentQueue.dequeue());
        System.out.println(concurrentQueue.dequeue());
    }
}
