package open_closed.not_obeying;

public class BonusCalculator {

    public static double calculateBonusForNormalEmployee(NormalEmployee employee) {
        return employee.baseSalary() * 0.2;
    }

    public static double calculateBonusForManager(Manager manager) {
        return manager.baseSalary() * 0.2;
    }
}
