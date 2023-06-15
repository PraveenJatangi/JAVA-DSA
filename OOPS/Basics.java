package OOPS;

public class Basics {
    
    public static void main(String[] args){
     BankAccount my = new BankAccount();
           my.update("xxx");
           System.out.println(my.password);

          Cars names= new Cars();
          for(int i=0;i<names.cars.length;i++){
            System.out.print(names.cars[i]+" ");
          }

    }
}

class BankAccount{
    String password ="yyyy"; // we cant change this from other classes but can update by a method
   public String useName;
   public void update(  String nwp){
    password=nwp;
   }

}

class Cars{
    String cars[]={ "creta","benz"};
}
