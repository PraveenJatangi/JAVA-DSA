public class MaxSubArray {

    //general bruite force method..

    public static void maxsubArray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){    
            for(int j=i;j<arr.length;j++){ 
                currSum=0;   
                for(int k=i;k<=j;k++){                 
                    currSum =currSum+arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            // System.out.println();
        }System.out.print("max sum="+maxSum);
    }

    // prefix sum method..

    public static void maxsubArray2(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){    
            for(int j=i;j<arr.length;j++){   
                               
                currSum =i==0?prefix[j]:prefix[j]-prefix[i-1];
                
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            // System.out.println();
        }System.out.print("max sum="+maxSum);
    }

    public static void kadanes(int arr[]){

        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];

            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);

    }

    //

    public static void main(String[] args){
        int arr[]={1,2,3};
        kadanes(arr);
        
    }
}

