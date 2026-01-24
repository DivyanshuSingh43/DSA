
import java.util.*;

class Perform{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
            System.out.print(q);
    }
}

// import java.util.*;
// class Perform2{
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         int n = q.size();
//         for(int i=0; i<=0; i++){
//             System.out.print(q);
//                 }
//                 q.add(q.remove());
//     }
// }

// class Main {
//     public static void addIndex(Queue<Integer> q) {
//         int n = q.size();

//         // Step 1: rotate first idx elements
//         for (int i = 1; i <=n; i++) {
//             q.add(q.remove());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         System.out.println(q);
//     }
// }

