package dependency_inversion.obeying;

public class User {

    private final UserRepository repository;

    public User(UserRepository repository) {
        this.repository = repository;
    }

    public void save() {
        repository.save(this);
    }
}
