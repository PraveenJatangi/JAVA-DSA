package PracticeCodes;

import javax.xml.namespace.QName;

public class Arrays {
    
    //Q1: print the count of  repeating key
    public static int find(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }

    //Q2:print the sum of the second row of matrix

    public static int sum(int matrix[][]){
            
             int row=0;
             int sum=0;
             int endcol=matrix[0].length-1;           
              
             for(int i=0;i<=endcol;i++){
                     sum+=matrix[row+1][i];
                }
             return sum;

    }
    //Q3: transpose of a matrix
    
   public static int[][] transpose(int matrix[][]) {
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] transpose = new int[col][row];
    
    // Transpose the matrix 
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }

    return transpose;
}

    public static void main(String[] args){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {1,2,3}       };

                        //System.out.println(find(matrix,4));
                        //System.out.println("sum of the second row is :"+sum(matrix));
     int now [][]= transpose(matrix);
      for(int i=0;i<=now.length-1;i++){
        for(int j=0;j<=now[0].length-1;j++){
            System.out.print(now[i][j]+" ");
        }
        System.out.println();
    }
}
}
