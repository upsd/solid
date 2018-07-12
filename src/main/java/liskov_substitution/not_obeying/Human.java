package liskov_substitution.not_obeying;

public class Human implements Animal {

    @Override
    public String getFlightMessage() {
        throw new RuntimeException(" I cannot fly!");
    }
}
