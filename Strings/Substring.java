package Strings;

public class Substring {
    public static String subString(String str,int si,int ei){
        String sub=" ";
        for(int i=si;i<ei;i++){
               sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args){
        String str="Hello World";
        System.out.println(subString(str,0,5));

        // largest string 

        String Bikes[]={"zukettz","royal","yamaha"};

        String largest=Bikes[0];
        for(int i=1;i<Bikes.length;i++){
            if(largest.compareTo(Bikes[i])<0){
                largest=Bikes[i];
            }
        }
        System.out.println(largest);
    }
}
