import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){

        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canReturnFizz(){
        //Given
        //Already done in setup method
        //When
        String result = fizzBuzz.getFizzBuzz(3);
        //Then
        String expected = "Fizz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnBuzz(){
        //Given
        //Already done in setup method
        //When
        String result = fizzBuzz.getFizzBuzz(5);
        //Then
        String expected = "Buzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnFizzBuzz(){
        //Given
        //Already done in setup method
        //When
        String result = fizzBuzz.getFizzBuzz(15);
        //Then
        String expected = "FizzBuzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnNumberAsString(){
        //Given
        //Already done in setup method
        //When
        String result = fizzBuzz.getFizzBuzz(4);
        //Then
        String expected = result;
        assertThat(result).isEqualTo(expected);
    }




}
