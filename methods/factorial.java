package methods;
public class factorial {
    

    
    
public static int fact(int n){
    int ans=1;
    for(int i=1;i<=n;i++){
        ans=ans*i;
        
    }
    return ans;
}
public static int bioCoefficent(int n,int r){
    int a= fact(n);
    int b=fact(r);
    int c=fact(n-r);
    
    int bio=a/(b*c);
    return bio;
}

public static void main(String[] args){
System.out.println(
bioCoefficent(5,2));
}
}

