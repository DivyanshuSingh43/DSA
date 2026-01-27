class Array{
    public static void main(String args[]){
    int[] arr = {10,20,30,40,50,60,70,80};
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            System.out.println(arr[i]+10);
        }
        else{
            System.out.println(arr[i]*2);

            }
        }
    }
}

// class Array{
//     public static void Modifyarray(int []arr){
//         for(int i=0;i<arr.length;i++){
//             if(i%2==0){
//                 arr[i]=arr[i]+10;
//             }
//             else{
//                 arr[i]=arr[i]*2;
//             }
//         }
//     }
//     public static void main(String args[]){
//     int[] arr = {10,20,30,40,50,60,70,80};
//     Modifyarray(arr);
//         }
//     }
