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
    } 
    
    public static int muiltiply(int a, int b){
        int product = a * b;
        return product;
    }
       // System.out.println("a = " + a);
         //System.out.println("b = " + b);
      
     
    public static int factorial(int n){
        int f = 1; 
        
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        
        return f;
    }
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
        public static void main(String args []){
            System.out.println(bincoeff(5,2));
        }
    
}
