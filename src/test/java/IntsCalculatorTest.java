import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.IntsCalculator;

import java.util.stream.Stream;

public class IntsCalculatorTest {

    IntsCalculator sut;

    @BeforeEach
    public void beforeEach() {
        sut = new IntsCalculator();
    }

    @AfterEach
    public void afterEach() {
        sut = null;
    }

    @Test
    public void powTest() {

        int a = 5, b = 6;
        int expected = 15625;

        int result = sut.pow(a, b);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void sumTest() {

        int a = 3, b = 2;
        int expected = 5;

        int result = sut.sum(a, b);

        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> multTest() {
        return Stream.of
                (Arguments.of(0, 2, 0),
                        Arguments.of(1, 2, 2),
                        Arguments.of(10, 5, 50));
    }

    @ParameterizedTest
    @MethodSource
    public void multTest(int a, int b, int expected) {

        int result = sut.mult(a, b);

        Assertions.assertEquals(expected, result);
    }

}
