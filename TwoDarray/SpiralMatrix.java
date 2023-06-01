package TwoDarray;

public class SpiralMatrix {
    public static void spiral(int matrix[][]){
        
        // define four variables for four sides of matrix
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
  while(startrow<=endrow && startcol<=endcol){
        // to print top 
        for(int j=startcol;j<=endcol;j++){
            System.out .print(matrix[startrow][j]+" ");
        }

        // to print right
        for(int i=startrow+1;i<=endrow;i++){
           System.out.print(matrix[i][endcol]+" ");
        }
    //to print bottom
     
        for(int j=endcol-1;j>=startcol;j--){
            if (startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][j]+" ");
        }
    
    // to print left
     
       for(int i=endrow-1;i>=startrow+1;i--){
        if(startcol==endcol){
            break;
        }
        System.out.print(matrix[i][startcol]+" ");
       }
    startcol++;
    startrow++;
    endcol--;
    endrow--;
    
    }
   
    }

    public static void main(String[] args){
        int matrix[][]={{1,2,3,0,},
                        {4,5,6,0},
                        {7,8,9,0},
                        {11,12,13,14}        };

          spiral(matrix);              

    }
}
