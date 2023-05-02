public class BinarySearch {
    

    public static int binSearch(int arr[],int key){
        int start=0;
        int end= arr.length-1;
        
      

        while(start<=end){
            int mid= (start+end)/2;

        if(arr[mid]== key){
            return mid;
        }
        if(arr[mid]>key){// left side operation
            end=mid-1;

        }
        else{
            start=mid+1;
        }
        
    }
    return -1;

    }

    public static void main(String[] args){
  

        int[] arr={1,4,3,5,6,7,9,8};
        int key=9;
        int ans=binSearch(arr, key);
        if(ans==-1){
            System.out.print("value not found");
        }
        else{
            System.out.print(ans);
        }
}}
