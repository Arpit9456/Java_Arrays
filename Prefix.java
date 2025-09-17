package Arrays;

public class Prefix {
    public static void isSubMax(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=1;j<arr.length;j++){
                int last=j;
                curSum= start == 0 ? prefix[last] : prefix[last] - prefix[start-1];
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

    

