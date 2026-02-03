import java.util.*;

class PeekPrint {
    public static void addIndex(Queue<Integer> q) {
        int n = q.size();

        // Step 1: rotate first idx elements
        for (int i = 0; i <=0; i++) {
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
        System.out.println(q.peek()+" ");
    }
}