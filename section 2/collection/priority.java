import java.util.*;

public class priority {
    public static void main(String[] args) {
        // Create a new priority queue
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add("C");
        queue.add("A");
        queue.add("B");

        // Print the contents of the queue
        System.out.println("Contents of the queue: " + queue);

        // Peek at the top element of the queue
        System.out.println("Peek at the top element of the queue: " + queue.peek());

        // Remove and print the top element of the queue
        System.out.println("Removed element from the queue: " + queue.poll());

        // Print the contents of the queue again
        System.out.println("Contents of the queue: " + queue);
    }
}
