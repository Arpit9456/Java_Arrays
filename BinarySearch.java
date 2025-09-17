package Arrays;

public class BinarySearch {
    public static int isBinary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
        
            if(arr[mid]==key){
                return mid;
        }
        if(arr[mid]<key){
            start=mid+1;

        }
        else{
            end=mid-1;
        }

    }
     
        return  -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,8,9,10,11,25,36,47};
        int key=10;
        System.out.println("Index for the key is " +isBinary(arr, key));
        
    }
    
}
