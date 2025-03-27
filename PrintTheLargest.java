import java.util.*;
public class Main{
    public static void main(String args[]){
        int C = 1, B = 3, A = 6;
        
        if(( A >= B ) && (A >= C)){
            System.out.println("largest is A");
        }
        else if (B >= C){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
