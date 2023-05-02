public class linearSearch {
    public static int linSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
              return i;  
            }    
        }return -1;
    }

    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9};
        int key=1;

        int ans=linSearch(array, key);
        if(ans==-1){
            System.out.print("not found");
        }
        else {
            System.out.print("indes number is :"+ans);
        }
    }
}
