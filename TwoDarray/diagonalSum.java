package TwoDarray;

public class diagonalSum {
    
    public static int diagSum(int matrix[][]){

        int sum=0;
        for(int i=0;i<matrix.length;i++){
              // primary diagonal sum
              sum+=matrix[i][i];

              //secondary diagonal sum
              if(i!= matrix.length-i-1)
              sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static void main(String[] args){
        
        int matrix[][]={{1,2,3,0,},
        {4,5,6,0},
        {7,8,9,0},
        {11,12,13,14}        };

        System.out.println(diagSum(matrix));
    }
}
