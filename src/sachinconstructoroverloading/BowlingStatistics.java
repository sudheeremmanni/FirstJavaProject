package sachinconstructoroverloading;

public class BowlingStatistics {
    public String gameFormat;
    public int noOfMatchesPlayed;
    public int noOfWickets;
    public int bowlingEconomy;

    public BowlingStatistics() {
        this.gameFormat = "ODI";
        this.noOfMatchesPlayed =400;
        this.noOfWickets = 200;
        this.bowlingEconomy = 20;
    }

    @Override
    public String toString() {
        return "BowlingStatistics{" +
                "gameFormat='" + gameFormat + '\'' +
                ", noOfMatchesPlayed=" + noOfMatchesPlayed +
                ", noOfWickets=" + noOfWickets +
                ", bowlingEconomy=" + bowlingEconomy +
                '}';
    }
}

