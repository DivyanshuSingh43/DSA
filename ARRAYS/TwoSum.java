public class TwoSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int target = 8;
        boolean result = hasPairWithSum(arr, target);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False.");
        }
    }
         
}