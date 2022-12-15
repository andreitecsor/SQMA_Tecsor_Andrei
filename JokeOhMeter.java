public class JokeOhMeter {
    private String joke;
    private int funnyAtPartyRate = 0;

    public JokeOhMeter(String joke) {
        if (joke == null) {
            throw new NullPointerException("You came here to test your jokes, this is not funny");
        }
        if (joke.isEmpty()) {
            funnyAtPartyRate = -1;
        }
        if (joke.contains("Chuck Norris")) {
            funnyAtPartyRate += 99;
        }
        if (joke.contains("English") || joke.contains("England")) {
            funnyAtPartyRate += 10;
        }
        if (joke.contains("you")) {
            funnyAtPartyRate += 40;
        }
        if (joke.contains("God")) {
            funnyAtPartyRate -= 10;
        }
    }

    public String areYouFunnyAtParties() {
        if (funnyAtPartyRate >= 50 && funnyAtPartyRate < 70) {
            return "You should be fine";
        }
        if (funnyAtPartyRate >= 70) {
            return "Have you considered stand-up comedy?";
        }
        if (funnyAtPartyRate == 0) {
            return "Just stay at home";
        }
        if (funnyAtPartyRate == -1) {
            return "No joke is better than a bad one";
        }
        return "Just keep quiet and take another sip";
    }

    public int getFunnyAtPartyRate() {
        return funnyAtPartyRate;
    }
}
