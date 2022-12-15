import org.junit.Assert;
import org.junit.Test;

public class BritishJokesTest {
    @Test
    public void britJoke1() {
        JokeOhMeter joke = new JokeOhMeter("Why doesn't England have a designated kidney bank? They have a 'Liverpool'.");
        Assert.assertEquals("Just keep quiet and take another sip", joke.areYouFunnyAtParties());
        Assert.assertEquals(10, joke.getFunnyAtPartyRate());
    }

    @Test
    public void britJoke2() {
        JokeOhMeter joke = new JokeOhMeter("What had the English telecom representative said to the man who wanted to describe a nuisance caller? Oh, you again.");
        Assert.assertEquals("You should be fine", joke.areYouFunnyAtParties());
        Assert.assertEquals(50, joke.getFunnyAtPartyRate());
    }

    @Test
    public void silentJoke() {
        JokeOhMeter joke = new JokeOhMeter("");
        Assert.assertEquals("No joke is better than a bad one", joke.areYouFunnyAtParties());
        Assert.assertEquals(-1, joke.getFunnyAtPartyRate());
    }

    @Test
    public void almostAJoke(){
        JokeOhMeter joke = new JokeOhMeter("Knock knock i forgot...");
        Assert.assertEquals("Just stay at home", joke.areYouFunnyAtParties());
        Assert.assertEquals(0, joke.getFunnyAtPartyRate());
    }
}
