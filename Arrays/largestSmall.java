public class largestSmall {
    
    public static int largest(int arr[]){
        int largestNumber=Integer.MIN_VALUE;
        int smallestNumber=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largestNumber<arr[i]){
                largestNumber=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(smallestNumber>arr[i]){
                smallestNumber=arr[i];
            }
        }
        System.out.println("smallest number is:"+smallestNumber);
        return largestNumber;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,6,5,4,7};
        System.out.println(largest(arr));
    }
}
