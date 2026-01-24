import java.util.*;

class RemoveAtIndex {
    public static void remIndex(Queue<Integer> q, int idx) {
        int n = q.size();

        for (int i=0; i<idx; i++) {
            q.add(q.remove());
        }
        q.remove();
        for(int i=0; i<n-idx-1; i++){
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
        remIndex(q,2);
        System.out.println(q);
    }
}
