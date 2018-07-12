# Single Responsibility
Initially there was a method `addAndMultiply` with the below implementation:
```java
public static int addAndMultiply(int a, int b, int multiplier) {
    return (a + b) * multiplier;
}
```
We can see from the name that it is doing two things, and consequently violating the Single Responsibility principle.

So we can split it out into something that looks like the below:
```java
public static int add(int a, int b) {
    return a + b;
}

public static int multiply(int numberToMultiply, int multiplier) {
    return numberToMultiply * multiplier;
}
```
This means we can test those independently too. Now the methods should only have one reason to change.