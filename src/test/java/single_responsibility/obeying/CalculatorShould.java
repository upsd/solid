package single_responsibility.obeying;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorShould {

    @Test
    public void add_numbers() {
        int result = Calculator.add(2, 10);
        assertThat(result, is(12));
    }

    @Test
    public void multiply_numbers() {
        int result = Calculator.multiply(2, 10);
        assertThat(result, is(20));
    }
}
