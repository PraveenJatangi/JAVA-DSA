package OOPS;

import java.util.*;

public class Inheritence {
    //properties and methods of a base class are passed on to a derived class
 public static void main(String args[]){
    
    // single level animals class
    Fish shark= new Fish();
    shark.eats();
    
    // multi level education class
       
       Domain  student = new Domain();
         student.year();

   // hierarchial inheritance music class
     
      classical singer = new classical();
       singer.singerName();
       

       HipHop director= new HipHop();
       director.directorName();

       PopularSongs song= new PopularSongs();
       song.popSong();
       
 }

 //// Hibrid inheritance 

   
    
     
    
    
   
     

}

// Single level inheritance
class Animal{
    String color;
     void eats(){
        System.out.println("yes eats");
     }
     void swims(){
        System.out.println("no cant swim");
     }
}

class Fish extends Animal{
    String name;

}

// Multi level inheritance 

class Education{
      String standard;
       void subject(){
       System.out.println("english");
       }
       void college(){
        System.out.println("yess college");
       }


}
class Degree extends Education{
          void year(){
            System.out.println("final year");
          }

}

class Domain extends Degree{
     void branch(){
        System.out.println("computer science");
     }
}

// Hierarchial Innheritance 

class Music{
     
    void directorName(){
     System.out.println("mm keeravani");
    }
    void singerName(){
      System.out.println("sid ");
    }
}

class HipHop extends Music{
    void songName(){
        System.out.println("no songs in hipHop by sid");
    }
}

//// Hibrid inheritance 

class PopularSongs  {
    void popSong(){
        System.out.println("the pop hip hop song is ' rarara'");
    }
}

class classical extends Music{
    void nameOfsongs(){
        System.out.println("ram siya ram");
    }
}



