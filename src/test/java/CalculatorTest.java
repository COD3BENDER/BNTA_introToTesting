import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach // so before each test setup will run
    public void setUp(){
        // before each test reset calculator object
        // now we don't have to re-initialize a new object in each method
        // If you need something that applies to all methods then add it otherwise put in test method
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers(){
        // Given
        //Calculator calculator = new Calculator();
        // When
        int actual = calculator.add(5,6);
        // Then
        int expected = 11;
        // Do assertion
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSubtractNumbers(){
        //Give
        //Calculator calculator = new Calculator();
        // When
        int actual = calculator.subtract(5,6);
        // Then
        int expected = -1;
        // Do assertion
        assertThat(actual).isEqualTo(expected);
    }
}
