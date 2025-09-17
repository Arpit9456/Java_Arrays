package Arrays; // Brute Force Algorithem

public class SubMax {
    public static void isSubMax(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=1;j<arr.length;j++){
                int last=j;
                curSum=0;
                for(int k=start;k<=last;k++){
                    curSum=curSum+arr[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;

                }

            }
        }
        System.out.println("Max sum arrays "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        isSubMax(arr);
    }
}
