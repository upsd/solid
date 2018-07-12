# Open/Closed
Initially there were two methods in `BonusCalculator`:
```java
public static double calculateBonusForNormalEmployee(NormalEmployee employee) {
    return employee.baseSalary() * 0.2;
}

public static double calculateBonusForManager(Manager manager) {
    return manager.baseSalary() * 0.2;
}
```

This means that we need to modify `BonusCalculator` every time we want to calculate the bonus for a new type of
employee. Clearly this violates the Open/Closed principle, because we have to modify an existing class to add
functionality.

An example of how we can obey the principle is by consolidating the methods into a single method, that takes an
`Employee` as a parameter:
```java
public static double calculateBonus(Employee employee) {
    return employee.baseSalary() * 0.2;
}
```
Employee is an interface here, meaning we are fixing the abstraction (i.e. the type of object being passed in).

Now we represent a normal employee by providing a implementation of `Employee`:
```java
public class NormalEmployee implements Employee {
    @Override
    public double baseSalary() {
        return 1000;
    }
}
```
And the same for a manager:
```java
public class Manager implements Employee {
    @Override
    public double baseSalary() {
        return 1500;
    }
}
```

This means that our client-code now looks like the below:
```java
calculateBonus(new NormalEmployee());
calculateBonus(new Manager());
```

Now `BonusCalculator` has no reason to change when a new type of employee is added to the system. 