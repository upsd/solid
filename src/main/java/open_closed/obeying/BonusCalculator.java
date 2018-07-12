package open_closed.obeying;

public class BonusCalculator {
    public static double calculateBonus(Employee employee) {
        return employee.baseSalary() * 0.2;
    }
}
