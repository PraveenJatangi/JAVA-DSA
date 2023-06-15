package OOPS;

public class GetSet {
    
    public static void main(String[] args){
    
    Pen myObjPen =new Pen();
       myObjPen.setColor("red");
       System.out.println(myObjPen.getColor());
     
       myObjPen.setTip(5);
       System.out.println(myObjPen.getTip() );


    }
}

   class Pen{
       private String pen_color;
       private int penTip;

        String getColor(){
            return this.pen_color;
        }
        int getTip(){
            return this.penTip;
        }

        void setColor(String col){
            this.pen_color= col;
        }

        void setTip(int tip){
            this.penTip=tip;
        }
    }

