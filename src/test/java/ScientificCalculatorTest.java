import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    // Atributo da classe para reutilizar a calculadora
    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        // Setup: Instancia o objeto antes de cada teste
        calculator = new ScientificCalculator();
        System.out.println("Nova instância da calculadora criada para o teste");
    }

    @Test
    void testAddition() {
        double result = calculator.add(2.0, 3.0);
        assertEquals(5.0, result);
    }

    @Test
    void testSubtract() {
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
    void testSquareRootPositive() {
        double result = calculator.sqrt(9.0);
        assertEquals(3.0, result);
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4.0));
    }
}