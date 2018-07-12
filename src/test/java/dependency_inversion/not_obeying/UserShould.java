package dependency_inversion.not_obeying;

import org.junit.Test;

public class UserShould {

    @Test
    public void save_itself() {
        User user = new User();
        user.save();
    }
}
