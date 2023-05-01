package methods;

public class BinDec {
    
    // to convert from binary to decial
    public static int  BinToDec(int binNum){
        int pow=0;
        int dec=0;
        while(binNum>0){
            int lastNumber= binNum%10;
            dec= dec+(lastNumber*((int)Math.pow(2,pow)));
            pow ++;
            binNum=binNum/10;
        }
        return dec;
    }


    //to convert from decimal to binary

    public static int  DecBin(int n){
           int pew=0;
           int bin=0;
        while(n>0){
             int rem= n%2;
              bin = bin +(rem* (int)Math.pow(10,pew));
              pew ++;
              n=n/2;

        }
        return bin;
    }

    //to find the sum of digits in a interger

    public static int  Sum(int n){
        int sum=0;
        while(n>0){ 
         int last=n%10;
         sum=sum+last;
         n=n/10;
        }
        return sum;
    }

    
    
    public static void main (String[] args){
      
        System.out.println(Sum(123));
    }
}
