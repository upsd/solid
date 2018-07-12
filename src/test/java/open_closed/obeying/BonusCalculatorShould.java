package open_closed.obeying;

import org.junit.Test;

import static open_closed.obeying.BonusCalculator.calculateBonus;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BonusCalculatorShould {

    @Test
    public void calculate_bonus_for_normal_employee() {
        double bonusToBePaid = calculateBonus(new NormalEmployee());

        assertThat(bonusToBePaid, is(200.00));
    }

    @Test
    public void calculate_bonus_for_manager() {
        double bonusToBePaid = calculateBonus(new Manager());

        assertThat(bonusToBePaid, is(300.00));
    }
}
