package methods;

public class isPrime {
     
   
     public static boolean isPrime(int n){
        // boolean Prime=true;
        if (n==2){
            return true;
        }
         for(int i=2;i<=n-1;i++){
            if( n%i==0){
              //  Prime=false;
                return false;
               }
            }
            return true;
     }
    // optimized way to find is a number prime or not

    public static boolean Prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){   // here we used square root function to remove repeated factors
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

     public static void main(String[] args){
        System.out.println(Prime(4));
        System.out.println(isPrime(4));
     } 

     
 }

