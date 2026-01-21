public class Missing {
    public static void main(String[] args) {
        System.out.println("Find the missing number in the array:");
        int arr[] = {2, 3, 4, 5, 6, 8, 9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]!=arr[i]+1){
            System.out.println("The Missing Number is: "+(arr[i]+1));
            break;
            }
            }
        }
    }
