package br.com.victor;

public class Fibonacci {

    public static long elementoFibonacci(int n) {

        long fibonacci = n <= 1
                ? n
                : (elementoFibonacci(n - 1) + elementoFibonacci(n - 2));
        return fibonacci;
    }

}
