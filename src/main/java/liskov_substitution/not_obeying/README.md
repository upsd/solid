# Liskov Substitution
As you can see there are two implementations of the `Animal` interface, however these are very different.
For instance, here is the `Bird` implementation:
```java
@Override
public String getFlightMessage() {
    return "I am a bird flying!";
}
```

This is in stark contrast to the `Human` implementation:
```java
@Override
public String getFlightMessage() {
    throw new RuntimeException(" I cannot fly!");
}
```

As you can tell, the two implementations do not have consistent behaviour, and so it violates LSP because you cannot
substitute one for the other. Here this is ultimately down to an incorrect abstraction.

Humans cannot fly and so `Human` should not be at the same level of abstraction as `Bird`. One possible solution could be to add
abstractions for animals that can fly and those who cannot.