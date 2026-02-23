
public class SortedZerosAndOnes {

    // Function to swap two elements
    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    } 
 
    // Two Pointer Method 
    public static void pointer(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // If left is 1 and right is 0 → swap
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            // If left is already 0 → move left
            if (arr[left] == 0) {
                left++;
            }

            // If right is already 1 → move right
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    // Main Method
    public static void main(String args[]) {
        int arr[] = {1, 0, 1, 0, 1, 0, 0, 1,0};

        pointer(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
