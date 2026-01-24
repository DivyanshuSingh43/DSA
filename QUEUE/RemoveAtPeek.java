import java.util.*;

public class RemoveAtPeek {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Print queue
        System.out.println("Queue: " + q);

        // Peek element (front)
        int peekElement = q.peek();
        System.out.println("Peek element: " + peekElement);

        // Remove peek element
        int removedElement = q.poll();
        System.out.println("Removed element: " + removedElement);

        // Queue after removal
        System.out.println("Queue after removal: " + q);
    }
}


