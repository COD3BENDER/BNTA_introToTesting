import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// in pom.xml we added dependencies

public class MainTest {
/// annotations are a flag which gives more info about a method

    @Test //@Test allows JUnit to treat this method as a test
    public void myFirstTest(){
        // assertion --> is A the same as B
        // need an expectation
        // need a result

        // BDD -- Behaviour Driven Development

            // Given .. (Arrange)
        String input = "HELLO";
            // When .. (Act)
        String actual = input.toLowerCase();
            // Then .. (Assert)
        String expected = "hello";
            // Do Assertion method
        assertThat(actual).isEqualTo(expected);  // the first part is what you get and the second part is the comparison
    }


}
