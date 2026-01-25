import java.util.*;

public class WinnerCircularGame {

    public static int findWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        // Add players 1 to n in the queue
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            // Rotate the queue k-1 times
            for (int i = 1; i < k; i++) {
                q.add(q.remove()); // remove from front, add to back
            }
            // Remove the k-th person
            System.out.println("Eliminated: " + q.remove());
        }

        // The last remaining person is the winner
        return q.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        System.out.print("Enter the step count (k): ");
        int k = sc.nextInt();

        int winner = findWinner(n, k);
        System.out.println("The winner is: Player " + winner);

        sc.close();
    }
}