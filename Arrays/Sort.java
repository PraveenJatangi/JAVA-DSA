import java.util.*;
public class Sort {
    public static void main(String[] args){
        
        int[] array=new int[20];
        int n,i,j,temp;
        Scanner sc=  new Scanner(System.in);
         System.out.println("enter size of array");
         n=sc.nextInt();




         for (i=0;i<n;i++){
            System.out.print("Enter array["+i+"]:");
            array[i]=sc.nextInt();
         }



         System.out.println("elements before sorting");

         for(i=0;i<n;i++){
            System.out.print(array[i]+" ");
         }
        

          
        for(i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]>array[j]){
                
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("elements after sorting  ");

        for(i=0;i<n;i++){
           System.out.print(array[i]+" ");
    }
}
}

