package SEARCHING;
class Linear {
    public static int Linearsearch(int num[],int key){
        for(int i = 0;i<num.length;i++){
                if(num[i]==key){
                    return i;
                }   
            } 
                   return -1;
                   }
    public static void main(String[] args) {

        int num[]={10,20,30,43,50};
        int key=43;
        int result=Linearsearch(num, key);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
                }
            }
        }
    

        
    

