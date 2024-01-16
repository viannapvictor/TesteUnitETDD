package br.com.victor;

/**
 * Classe utilizada para fins educativos no curso de Engenheiro Backend
 */
public class Calculadora {

    /**
     * Método para cálculo do soma de dois números inteiros;
     * @param a O primeiro número a ser usado.
     * @param b o Segundo número a ser usado.
     * @return A soma de a e b
     */
    public  int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Método para cálculo do subtração de dois números inteiros;
     * @param a O primeiro número a ser usado.
     * @param b o Segundo número a ser usado.
     * @return A subtração de a e b
     */
    public  int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método para cálculo do multiplicação de dois números inteiros;
     * @param a O primeiro número a ser usado.
     * @param b o Segundo número a ser usado.
     * @return A multiplicação de a e b
     */
    public  int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para cálculo do divisão de dois números inteiros;
     * @param a O primeiro número a ser usado, numerador.
     * @param b o Segundo número a ser usado, denominador.
     * @return A divisão de a e b
     */
    public  int dividir(int a, int b) {
        if (divisaoPorzero(b)) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }

    /**
     * Método para determinar se o númerador é zero do divisão de dois números inteiros;
     * @param b o número a ser usado.
     * @return true se o número for 0
     */

    public  boolean divisaoPorzero(int b) {
        if (b == 0) {
            return true;
        }
        return false;
    }
}
