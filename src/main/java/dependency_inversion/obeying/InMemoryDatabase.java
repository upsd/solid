package dependency_inversion.obeying;

public class InMemoryDatabase implements UserRepository {

    private User user;

    @Override
    public void save(User user) {
        this.user = user;
    }

    @Override
    public User read() {
        return this.user;
    }
}
