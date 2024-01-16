package main;

import br.com.victor.Calculadora;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    final Calculadora calculadora = new Calculadora();

    @Test
    public void testeAdicionar_HappyPath() {
        final int soma = calculadora.adicionar(10, 10);
        assertEquals(20, soma);
    }

    @Test
    public void testeSubtrair_HappyPath() {
        final int subtracao = calculadora.subtrair(10, 10);
        assertEquals(0, subtracao);
    }

    @Test
    public void testeMultiplicar_HappyPath() {
        final int multiplicar = calculadora.multiplicar(10, 10);
        assertEquals(100, multiplicar);
    }

    @Test
    public void testeDividir_HappyPath() {
        final int dividir = calculadora.dividir(10, 10);
        assertEquals(1, dividir);
    }

    @Test
    public void testeDividir_DivisaoPorZero() {
        Assert.assertTrue(calculadora.divisaoPorzero(0));
    }

}
