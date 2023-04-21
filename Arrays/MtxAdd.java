import java.util.*;
public class MtxAdd {
   public static void main(String[] args){

    int i,j;
    int[][] a= {{1,2,3},{4,5,6}};
    int[][] b={{2,3,4},{7,8,9}};
    int[][] c= new int[2][3];
     
    for ( i=0;i<2;i++){
      for ( j=0;j<3;j++){
         c[i][j]=a[i][j]+b[i][j];
         System.out.print(c[i][j]+" ");
      }
      System.out.println("");
    }
    
    

   } 
}
