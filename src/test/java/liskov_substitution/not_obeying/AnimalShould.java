package liskov_substitution.not_obeying;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnimalShould {

    @Test
    public void denote_flight_message_for_a_bird() {
        Bird bird = new Bird();
        String message = bird.getFlightMessage();

        assertThat(message, is("I am a bird flying!"));
    }

    @Test
    public void denote_flight_message_for_a_human() {
        Human human = new Human();
        String message = human.getFlightMessage();

        assertThat(message, is("I am a human flying!"));
    }
}