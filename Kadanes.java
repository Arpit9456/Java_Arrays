package Arrays;

public class Kadanes {
    public static void isKadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum = currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            ms=Math.max(currSum, ms);
        }
        System.out.println("our max subarray is :"+ms);

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        isKadanes(arr);
        
    }
}
