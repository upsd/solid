# Dependency Inversion
In the original code, [User](./not_obeying/User.java) was coupled (and consequently dependent) to the persistence class 
[Database](./not_obeying/Database.java). This means that we cannot change where the user is persisted without modifying
the `User` class. Consequently it has multiple reasons to change.

To circumvent this we can introduce an [interface](./obeying/UserRepository.java) that inverts the dependency, meaning
that `User` is no longer dependent on where it is persisted, but the other way around. Furthermore, we can now pass the
storage class to `User` during construction:
```java
UserRepository inMemoryDatabase = new InMemoryDatabase();
User user = new User(inMemoryDatabase);

user.save();
```