import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Calculator;

public class CalculatorTest {

    Calculator sut;

    @BeforeEach
    public void BeforeEach() {
        sut = new Calculator();
    }

    @AfterEach
    public void AfterEach() {
        sut = null;
    }

    @Test
    public void addOperandTest() {
        double a = 5;
        double expected = 5;

        double result = sut.newFormula().addOperand(a).getA();

        Assertions.assertEquals(expected, result);
    }


    @Test
    public void resultExceptionTest() {
        Assertions.assertThrows(IllegalStateException.class, () -> sut.newFormula().result());
    }
}
