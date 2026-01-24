import java.util.*;

class ADDATINDEX {
    public static void addIndex(Queue<Integer> q, int idx, int data) {
        int n = q.size();

        // Step 1: rotate first idx elements
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Step 2: add new element
        q.add(data);

        // Step 3: rotate remaining elements
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        addIndex(q, 2, 60);

        System.out.println(q);
    }
}