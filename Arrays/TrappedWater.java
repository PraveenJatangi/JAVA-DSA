public class TrappedWater {
    
   
    public static int trappedWater(int [] height){
          //leftboundary array
            
          int leftboundary[]=new int[height.length];  
          leftboundary[0]=height[0];
          for(int i=1;i<height.length;i++){
            leftboundary[i]=Math.max( height[i],leftboundary[i-1]);
          }

          //right boundary array

          int rightBoundary[]=new int [height.length];
           rightBoundary[height.length-1]=height[height.length-1];
           for(int i=height.length-2;i>=0;i--){
            rightBoundary[i]=Math.max(height[i],rightBoundary[i+1]);
           }

           // trapped water
           int trapWater=0;

           //looop

           for(int i=0;i<height.length;i++){
              int waterLevel= Math.min(leftboundary[i],rightBoundary[i]);
              trapWater+=waterLevel-height[i];
           }
            
          return trapWater;
    }

    
    public static void main(String[] args){
        int [] heights={4,2,0,6,3,2,5};
       System.out.println( trappedWater(heights));
    }
}
