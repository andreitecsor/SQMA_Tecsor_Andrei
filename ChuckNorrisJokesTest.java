import org.junit.Assert;
import org.junit.Test;

public class ChuckNorrisJokesTest {
    @Test
    public void chuckJoke1() {
        JokeOhMeter joke = new JokeOhMeter("When God said, “Let there be light!” Chuck Norris said, “Say Please.");
        Assert.assertEquals("Have you considered stand-up comedy?", joke.areYouFunnyAtParties());
        Assert.assertEquals(89, joke.getFunnyAtPartyRate());
    }

    @Test
    public void chuckJoke2() {
        JokeOhMeter joke = new JokeOhMeter("There is no chin behind Chuck Norris' beard. There is only another fist.");
        Assert.assertEquals("Have you considered stand-up comedy?", joke.areYouFunnyAtParties());
        Assert.assertEquals(99, joke.getFunnyAtPartyRate());
    }

    @Test(expected = NullPointerException.class)
    public void nullJoke() {
        JokeOhMeter joke = new JokeOhMeter(null);
    }
}