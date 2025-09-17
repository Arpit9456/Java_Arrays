public class Greater {
    public static int isLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }

        }
        System.out.println("This is the samllest value "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,8,5,9};
      System.out.println(isLargest(arr));
        
    }
}
