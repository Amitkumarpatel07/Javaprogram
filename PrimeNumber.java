import java.util.*;
public class Main{
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
            System.out.print(i+" ");
        }
    }
    System.out.println();
}

public static void main(String args[]){
    primesInRange(20);
    }
}
