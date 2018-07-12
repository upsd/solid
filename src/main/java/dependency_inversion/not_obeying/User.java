package dependency_inversion.not_obeying;

public class User {

    private final Database database;

    public User() {
        this.database = new Database();
    }

    public void save() {
        this.database.save(this);
    }
}
