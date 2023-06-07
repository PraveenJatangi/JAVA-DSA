package SortingAlg;

public class SelectionSort {
    
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int mainPoint=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mainPoint]>arr[j]){
                    mainPoint=j;
                }
            }
            int temp =arr[mainPoint];
            arr[mainPoint]=arr[i];
            arr[i]=temp;

        }
    }

    // pick the smallest and put it in the begining is what happens in this selection sort
    // to find the samllest int array... take i as a min number and compare ..if found any lesser number then update 
       // min position
    public static void main(String[] args){
        int arr[]={2,3,1,5,4};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
}
