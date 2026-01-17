import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int Sum = a + b;
        System.err.println(a);
        System.out.println("Total sum of a+b is: "+Sum);
    }
}