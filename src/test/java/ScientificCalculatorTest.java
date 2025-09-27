import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void testAddition() {
        ScientificCalculator calculator = new ScientificCalculator();
        double result = calculator.add(2.0, 3.0);
        assertEquals(5.0, result);
    }
    @Test
    void testSubtract() {
        // 1. SETUP: Preparação do ambiente de teste
        // Aqui estou criando a instancia que será usada no teste
        ScientificCalculator calculator = new ScientificCalculator();

        // 2. EXECUTION: Execução da operação que irei testar
        // Chamo o metodo subtract
        double result = calculator.subtract(5.0, 2.0);

        // 3. ASSERTION: Verifica se o resultado é o esperado e comparado o valor obtido com o valor esperado.
        assertEquals(3.0, result);

        //4. TEARDOWN: Não será necessário a criação de limpeza nesse caso.
    }
}
