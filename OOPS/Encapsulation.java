package OOPS;

public class Encapsulation {
    // wrapping methods and data(properties)
    // also data hiding 

    public static void main(String[] args){
       
        // Constructor obj= new Constructor();
        // Constructor obj2= new Constructor("ram");
        // System.out.println(obj2.name);
        // Constructor obj3= new Constructor(9);
        // System.out.println(obj3.Roll);


        Student s1= new Student();
        s1.name="michel";
        s1.roll= 123;
        s1.password="xyz";
        s1.marks = new int[3]; 
        s1.marks[0]=1;
        s1.marks[1]=2;
        s1.marks[2]=3;
        
        Student  s2= new Student(s1);
        s2.password="neww";
        s2.marks[1]=100;
        System.out.println(s2.password);
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);

        }
          
    }

}

class Constructor{
   // it is a special method which is invoked automatically at the time of object creation
   // has same name as class
   //no return types
   //only called once at time of object creation
   
   String name; //properties
   int Roll;

   //non parametrized 
   Constructor(){
  System.out.println("constructor is called...");
   }
  
   // parametrized
   Constructor(String name){
    this.name=name;
   }
   Constructor (int roll){
    this.Roll=roll;
   }


}

class Student{
     String name;
     int roll;
     String password;
     int marks[];
     Student(){
       System.out.println("constructer is called...");
     }

     Student( Student s1){
       this.name=s1.name;
       this.roll=s1.roll;
       this.password=s1.password;
       //marks=new int[3];
       this.marks=s1.marks;
     }

    

     Student(String name){
       marks=new int[3];
        this.name=name;
     }

     Student(int roll){
       marks=new int[3];
        this.roll=roll;
     }
}