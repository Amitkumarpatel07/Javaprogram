import java.util.*;
public class Main{
    public static void main (String args[]){
        int age =2;
        if(age >=18){
            System.out.print("adult : drive,vote");
            
        }
        
        if(age >13 && age <18){
            System.out.println("teeneger");
        }
       // if(age > 5 && age < 12){
           // System.out.println("child");
        //}
       // if(age > 1 && age < 11){
         //   System.out.println("Baby");
       // }
        
        else{
            System.out.print("Not adult");
        }
    }
}
