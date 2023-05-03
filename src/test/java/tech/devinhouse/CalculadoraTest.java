package tech.devinhouse;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes unitarios de Calculadora")
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach   // metodo com codigo que deve ser executado antes de cada metodo de teste
    public void setup() {
        System.out.println("Executado antes de cada metodo de testes");
        calculadora = new Calculadora();
    }


    @Test
    @DisplayName("Quando soma dois numeros positivos, deve retornar um nro positivo")
    void calcular_adicao() {
        // given   - pre condicoes
        Double valor1 = 3.2, valor2 = 5.1;
        // when - qdo chama o metodo que eu quero testar
        Double resultado = calculadora.calcular(valor1, valor2, Operacao.ADICAO);
        // then - entao
        assertNotNull(resultado); // conferindo que o resultado nao eh nulo
        assertEquals(8.3, resultado);
    }

    @Test
    @DisplayName("Quando soma o primero nro positivo e o segundo nro negativo, com primeiro nro maior que o segundo, deve retornar um nro positivo")
    void calcular_adicao_nronegativo() {
        Double valor1 = 5.0, valor2 = -3.0;
        Double resultado = calculadora.calcular(valor1, valor2, Operacao.ADICAO);
        assertNotNull(resultado); // conferindo que o resultado nao eh nulo
        assertEquals(2.0, resultado);
    }

    @Test
    @DisplayName("Quando subracao de dois nros positivos, sendo o primeiro maior, deve retornar nro positivo")
    void calcular_subtracaopositivos() {
        Double valor1 = 5.6, valor2 = 3.3;
        Double resultado = calculadora.calcular(valor1, valor2, Operacao.SUBTRACAO);
        assertNotNull(resultado);
        assertTrue(resultado instanceof Double);
        assertEquals(2.3, resultado);
    }

}