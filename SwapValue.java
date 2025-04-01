import java.util.*;
public class Main{
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2; 
        
    }
    
    public static void swap(int a, int b){
      
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
         System.out.println("b = " + b);
      
    } 
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
