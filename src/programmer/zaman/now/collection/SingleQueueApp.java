package programmer.zaman.now.collection;

import programmer.zaman.now.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        System.out.println(queue.offer("gils"));
        System.out.println(queue.offer("diva"));
        System.out.println(queue.offer("udin"));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());


    }
}
