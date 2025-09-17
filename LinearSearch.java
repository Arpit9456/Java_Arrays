public class LinearSearch {
      public static int isSearch(int arr[],int key){
            for(int i=0;i<arr.length;i++){
                  if(arr[i]==key){
                        return i;
                  }
                  
            }
            return -1;
      }
      public static void main(String[] args) {
            int arr[]={2,3,5,4,6,7,8,9,10,11,22,33,44};
            int key=10;
            int index=isSearch(arr, key);
            if(index== -1){
                  System.out.println("Not found");
            }
            else{
            System.out.println("index is found "+index);
            
            }
      }    
}
