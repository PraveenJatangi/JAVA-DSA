package methods;

public class overload {
     // parameter overloading
    public static int Sum(int a,int b){
        return a+b;
    }

    // same sum method with different parameters
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
   // data type over loading
    public static float Sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args){
      System.out.println( Sum(2,3));
        System.out.println(Sum(2,3,4));
        System.out.println(Sum(1.2f,1.8f));
    }
}
