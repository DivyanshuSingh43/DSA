import java.util.*;

public class Reverse{
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Step 1: Push all elements into stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Step 2: Pop from stack and add back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        reverseQueue(q);
        System.out.println(q); // Output: [40, 30, 20, 10]
    }
}
