package br.com.exemplo.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes para a classe Calculadora")
class CalculadoraTest {

    @Test
    @DisplayName("Somar dois inteiros deve retornar resultado correto")
    void somar_doisNumeros_retornaSoma() {
        // Arrange
        Calculadora calc = new Calculadora();

        // Act
        int resultado = calc.somar(3, 7);

        // Assert
        assertEquals(10, resultado);
    }

    @Test
    @DisplayName("Subtrair dois inteiros deve retornar resultado correto")
    void subtrair_doisNumeros_retornaDiferenca() {
        // Arrange
        Calculadora calc = new Calculadora();

        // Act
        int resultado = calc.subtracao(10, 4);

        // Assert
        assertEquals(6, resultado);
    }

    @Test
    @DisplayName("Multiplicar dois inteiros deve retornar resultado correto")
    void multiplicar_doisNumeros_retornaProduto() {
        // Arrange
        Calculadora calc = new Calculadora();

        // Act
        int resultado = calc.multiplicar(5, 6);

        // Assert
        assertEquals(30, resultado);
    }

    @Test
    @DisplayName("Dividir dois inteiros deve retornar resultado correto")
    void dividir_doisNumeros_retornaQuociente() {
        // Arrange
        Calculadora calc = new Calculadora();

        // Act
        double resultado = calc.dividir(8, 2);

        // Assert
        assertEquals(4.0, resultado);
    }

    @Test
    @DisplayName("Dividir por zero deve lançar IllegalArgumentException")
    void dividir_divisorZero_deveLancarExcecao() {
        // Arrange
        Calculadora calc = new Calculadora();

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0),
                "Dividir por zero deveria lançar IllegalArgumentException");
    }
}


