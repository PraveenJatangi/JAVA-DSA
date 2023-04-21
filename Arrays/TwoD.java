import java.util.*;
public class TwoD {
    public static void main(String[] args){
    int i,j,row,col;
    int[][] a=new int[10][10];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows ");
    row= sc.nextInt();
    System.out.println("Enter no of cols");
    col=sc.nextInt();

    System.out.println("Enter values "+(row*col)+"");
    for(i=0;i<row;i++){
        for (j=0;j<col;j++){

        a[i][j]=sc.nextInt();
        }
    }

    System.out.print("the array is \n ");
    
    for (i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }

}
}