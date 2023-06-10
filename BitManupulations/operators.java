package BitManupulations;

public class operators {
    
    //1. Get ith bit 

    public static int getIthBIt( int n, int i){
        int bitmark=1<<i;
        if((n & bitmark)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //2.Set ith bit
    public static int setIthBit(int n,int i){
        int bitmark=1<<i;
        return n|bitmark;
    }

    //3.clear ith bit

    public static int clearIthBit(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    // update ith bit
    public static int updateIthBit(int n,int i, int newbit){
        if(newbit==0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    // clear last i bits

    public static int clearLastIBits(int n ,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    //clear Range of bits

    public static int rangeOfBits(int n,int i,int j){
         int a= (~0)<<j+1;
         int b=(1<<i)-1;
         int bitmask=a|b;
         return n&bitmask; 
    }

    // Check if a number is power of 2 or not

    public static boolean checkPower(int n){
        if((n&n-1)==0){
            return true;    
        }
        else{
            return false;
        }
    }

    //count set bits in a number

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        
        // System.out.println(getIthBIt(100, 1));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(5, 2));
       // System.out.println(updateIthBit(10,2,1));
      // System.out.println(clearIthBit(10, 1));
       //System.out.println(rangeOfBits(15, 1, 2));
       //System.out.println(checkPower(9));
       System.out.println(countSetBits(10));
    }
}
