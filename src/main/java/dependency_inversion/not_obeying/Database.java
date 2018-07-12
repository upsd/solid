package dependency_inversion.not_obeying;

public class Database {

    User record;

    public void save(User record) {
        this.record = record;
    }

    public User read() {
        return this.record;
    }
}
