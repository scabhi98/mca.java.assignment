package com.scabhi98.groupA;

public class PrimeNumbers {
    private int start, end;
    public PrimeNumbers() {}
    public void setRange(int start, int end) {
        if(start <= end) {
            this.start = start;
            this.end = end;
        }else {
            this.start = end;
            this.end = start;
        }
    }
    public boolean isPrime(int num){
        boolean isPrime;
        int factor = 2;
        while((isPrime = (num % factor != 0)) && factor < Math.sqrt(num))
            factor++;
        return isPrime;
    }
    public void printList(){
        System.out.print("\nPrime Numbers:");
        for(int n = start; n < end; n++){
            if(isPrime(n))
                System.out.print(" " + n);
        }
    }
}
