import java.util.*;

public class ReverseAtKth {

    public static void reverseFirstK(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<>();

        // put first k elements into stack
        for(int i = 0; i < k; i++){
            s.push(q.remove());
        }

        // put stack elements back into queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        // move remaining elements to back
        int n = q.size() - k;
        for(int i = 0; i < n; i++){
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

        reverseFirstK(q, 3);

        System.out.println(q);
    }
}
