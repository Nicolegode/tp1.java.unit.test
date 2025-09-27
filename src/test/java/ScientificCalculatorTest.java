import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
        System.out.println("Nova instância da calculadora criada para o teste");
    }

    // Testes básicos
    @Test
    void testAddition() {
        double result = calculator.add(2.0, 3.0);
        assertEquals(5.0, result);
    }

    @Test
    void testSubtractPositiveNumbers() {
        // 1. SETUP: (já feito no @BeforeEach)
        // A instância já foi criada no setUp()

        // 2. EXECUTION: Execução da operação que irei testar
        // Chamo o metodo subtract
        double result = calculator.subtract(5.0, 2.0);

        // 3. ASSERTION: Verifica se o resultado é o esperado e comparado o valor obtido com o valor esperado.
        assertEquals(3.0, result);

        //4. TEARDOWN: Não será necessário a criação de limpeza nesse caso.
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(4.0, 5.0);
        assertEquals(20.0, result);
    }

    @Test
    void testSquareRootPositive() {
        double result = calculator.sqrt(9.0);
        assertEquals(3.0, result);
    }

    @Test
    void testLogNaturalNumber() {
        assertEquals(1.0, calculator.log(Math.E), 0.001);
    }

    // Testes com seno e cosseno
    @Test
    void testSin() {
        assertEquals(1.0, calculator.sin(90.0), 0.001);
    }

    @Test
    void testCos() {
        assertEquals(1.0, calculator.cos(0.0), 0.001);
    }

    // Testes que devem dar erro.
    @Test
    void testSquareRootThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4.0));
    }

    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void testLogWithNegativeNumber() {
        // Testando se log de número negativo dá erro
        assertThrows(IllegalArgumentException.class, () -> calculator.log(-1.0));
    }

    @Test
    void testLogWithZero() {
        // Log de zero também deve dar erro
        assertThrows(IllegalArgumentException.class, () -> calculator.log(0.0));
    }

    // Testes extras
    @Test
    void testPowerOperation() {
        double result = calculator.power(2.0, 3.0);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        double result = calculator.add(-2.0, 3.0);
        assertEquals(1.0, result);
    }
}