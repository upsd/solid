package single_responsibility.not_obeying;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorShould {

    @Test
    public void add_and_multiply_numbers() {
        int result = Calculator.addAndMultiply(2, 4, 10);
        assertThat(result, is(60));
    }
}
