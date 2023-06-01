package PracticeCodes;

import java.util.HashSet;

public class Assignments {
    
    //Q1: print true if any values repeats in an given array if not print false;
   public static boolean repeaters(int[] nums){
      
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;i++){
            if(nums[i]==nums[j]){
               return true;
            }
        }
         
    }
    return false;
   }



   //Q2: find key value in an given array 

   public static boolean search(int[] nums){
    HashSet <Integer>set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return true;
           
        }
        else{
            set.add(nums[i]);
        }
    }
    return false;
   }

   // different way
   public static int linSearch(int[ ] nums,int key){
            key=0;
    for(int i=0;i<nums.length;i++){
        if(key==nums[i]){
           return i;    
        } 
    }return -1;
   }



   //Q3:
   

   
   public static void main(String[] args){
    String original = "hello";
    String reverse="";
    for(int i=0;i<original.length();i++){
        reverse = original.charAt(i)+reverse;
    }
     
     System.out.println(reverse); 
   }

  

}
