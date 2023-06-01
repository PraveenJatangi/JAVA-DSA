package TwoDarray;
import java.util.*;

public class basicArray {
     
    // this is a function to find an element in the matrix
    public static boolean search (int matrix[][],int key){
        
    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found key at :("+i+","+j+")");
                    
                }  
            }
        }
        System.out.println("key not found");
        return false;
       
    }

    // funtion to find the maximum value in an given matrix

    public static int max(int matrix[][]){
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }

    // method to find the minimum value in an matrix

    public static int min(int matrix[][]){
        int min=Integer.MAX_VALUE;
    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
    int[][] matrix= new int[3][3];
     
    //taking input from user 

     Scanner sc= new Scanner(System.in);
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
 // printing output of the matrix
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
     }

// print search value
     search(matrix, 2);
    
// print max value
     System.out.println("the maximum number in array is :"+max(matrix));

//to print minimun number in an array
     System.out.println("the minimum number in array is :"+min(matrix));
    }

    
}
