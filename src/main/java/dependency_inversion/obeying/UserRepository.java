package dependency_inversion.obeying;

public interface UserRepository {

    void save(User user);
    User read();
}
