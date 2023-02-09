package assignment_1;

import java.util.ArrayList;
import java.util.Arrays;

// Print prime numbers form 2 to 100
public class Task1 {
    public static boolean isPrime(int k){
        for(int i = 2; i<= k/2; i++){
            if (k%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int a, int b){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = a; i<=b; i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }

        System.out.println(primes);
    }

    public static void main(String[] args){
        printPrimes(2, 100);
    }
}
