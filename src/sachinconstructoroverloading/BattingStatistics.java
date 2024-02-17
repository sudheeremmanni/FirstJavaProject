package sachinconstructoroverloading;

public class BattingStatistics {
    public String gameFormat;
    public int noOfMatchesPlayed;
    public int noOfRunsScored;
    public float battingStrike;
    public float battingAverage;

    public BattingStatistics() {
        this.gameFormat = "ODI";
        this.noOfMatchesPlayed = 400;
        this.noOfRunsScored = 20000;
        this.battingStrike = 90;
        this.battingAverage = 55;
    }

    @Override
    public String toString() {
        return "BattingStatistics{" +
                "gameFormat='" + gameFormat + '\'' +
                ", noOfMatchesPlayed=" + noOfMatchesPlayed +
                ", noOfRunsScored=" + noOfRunsScored +
                ", battingStrike=" + battingStrike +
                ", battingAverage=" + battingAverage +
                '}';
    }




}
