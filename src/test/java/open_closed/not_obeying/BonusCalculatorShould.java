package open_closed.not_obeying;

import org.junit.Test;

import static open_closed.not_obeying.BonusCalculator.calculateBonusForManager;
import static open_closed.not_obeying.BonusCalculator.calculateBonusForNormalEmployee;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BonusCalculatorShould {

    @Test
    public void calculate_bonus_for_normal_employee() {
        double bonusToBePaid = calculateBonusForNormalEmployee(new NormalEmployee());

        assertThat(bonusToBePaid, is(200.00));
    }

    @Test
    public void calculate_bonus_for_manager() {
        double bonusToBePaid = calculateBonusForManager(new Manager());

        assertThat(bonusToBePaid, is(300.00));
    }
}
