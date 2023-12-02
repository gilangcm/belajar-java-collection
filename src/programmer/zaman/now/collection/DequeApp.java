package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("gils");
        stack.offerLast("diva");
        stack.offerLast("dinda");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("QUEUE BIASA");
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Gils");
        queue.offerLast("diva");
        queue.offerLast("dinda");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
