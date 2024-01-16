package main;

import br.com.victor.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    final Fibonacci fibonacci = new Fibonacci();
    @Test
    public void testeElementoFibonacci_HappyPath() {
        long elemento = fibonacci.elementoFibonacci(6);
        assertEquals(8, elemento);
    }

    @Test
    public void testeElementoFibonacci_PosicaoZero() {
        long elemento = fibonacci.elementoFibonacci(0);
        assertEquals(0, elemento);
    }

    @Test
    public void testeElementoFibonacci_PosicaoUm() {
        long elemento = fibonacci.elementoFibonacci(1);
        assertEquals(1, elemento);
    }
}
