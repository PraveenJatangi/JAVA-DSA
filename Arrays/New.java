import java.util.*;
public class New {
  public static void main(String[] args){
    int[] a= new int[20];
    int n,i,sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter array size");
      n= sc.nextInt();
      for (i=0;i<n;i++){
        System.out.print("enter a["+i+"]:");
        a[i]=sc.nextInt();
      }
      for (i=0;i<n;i++){
        System.out.println(a[i]+"");
    }
    for (i=0;i<n;i++){
        System.out.println("array["+i+"]:"+a[i]);
    }
    for (i=0;i<n;i++){
        sum=sum+a[i];
    }
    System.out.println(sum);
  }  
}
