package dependency_inversion.obeying;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserShould {

    @Test
    public void save_to_a_specified_repository() {
        UserRepository inMemoryDatabase = new InMemoryDatabase();
        User user = new User(inMemoryDatabase);

        user.save();

        User savedUser = inMemoryDatabase.read();

        assertThat(savedUser, is(user));
    }
}
