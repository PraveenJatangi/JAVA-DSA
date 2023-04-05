// Patterns questions
//Q1
                                   /*
  *****
  *****
  *****
  *****
  *****
                                   */

import java.util.*;
public class Main{ 

  public static void  pattern1(){
          for(int i=1;i<=5;i++){
               for(int j=0;j<=5;j++){
                    System.out.print("*");

               }
               System.out.println(" ");
          }
   }

//Q2 
/*   *****
     *   *
     *   *
     *   *
     *****      */

   public static void pattern2(){
        int n=5;
        int m=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                System.out.print("*");
                }
                else{
                System.out.print(" ");}
            }
            System.out.println("");
        }
    }


//Q3

/*
        * 
        **
        ***
        ****
        *****
 */


     public static void pattern3(){
          for (int i=1;i<=5;i++){
               for(int j=0;j<i;j++){
                    System.out.print("*");
               }
               System.out.println(" ");
          }
     }


//Q4
                                                      /*
****** 
*****
****
***
**
*                                                         */

     public static void pattern4(){
          for (int i=5;i>=0;i--){
                              for(int j=0;j<=i;j++){
                                   System.out.print("*");
                              }
                              System.out.println(" ");
                         }
     }
     


//Q5 
                                                          /*
     * 
    **
   ***
  ****
 *****                                                         
                                                           */


     
     public static void pattern5(){
          int n=5;
           for (int i=1;i<=n;i++){
              for (int j=1;j<=n-i;j++){
               System.out.print(" ");
              }
              for(int j=0;j<i;j++){
                System.out.print("*");
              }
              System.out.println(" ");
           }

     }

//Q6
/*
1 
12
123
1234
12345
 */


     public static void pattern6(){
          for (int i=1;i<=5;i++){
               for(int j=1;j<=i;j++){
                    System.out.print(j);
               }
               System.out.println(" ");
          }
     }


//Q7
/*
12345 
1234
123
12
1
 */


     public static void pattern7(){
          int n=5;
          for (int i=n;i>=1;i--){
               for(int j=1;j<=i;j++){
                    System.out.print(j);
               }
               System.out.println(" ");
          }
     }



//Q8
/*
1  
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */


     public static void pattern8(){
          int n=5;
          int number =1;
          for (int i=1;i<=n;i++){
               for(int j=1;j<=i;j++){
                    System.out.print(number+" ");
                    number++;
               }
               System.out.println(" ");
          }
     }


//Q9
/*
1 
01
101
0101
10101
 */


     public static void pattern9(){
          for (int i=1;i<=5;i++ ){
               for(int j=1;j<=i;j++){
                    int sum=i+j;
                    if (sum%2==0){
                         System.out.print("1");
                    }
                    else{
                         System.out.print("0");
                    }
               }
               System.out.println(" ");
          }
     } 


     public static void main(String[] args){
          
          
          pattern1();
          pattern2();
          pattern3();
          pattern4();
          pattern5();
          pattern6();
          pattern7();
          pattern8();
          pattern9();
     
     }
}

