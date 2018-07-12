package liskov_substitution.not_obeying;

public class Bird implements Animal{

    @Override
    public String getFlightMessage() {
        return "I am a bird flying!";
    }
}
