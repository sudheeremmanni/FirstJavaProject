package sachinconstructoroverloading;

public class SachinTest {
    public static void main(String args[]){
        BattingStatistics bat = new BattingStatistics();
        bat.gameFormat = "Test";
        bat.noOfMatchesPlayed = 120;
        bat.noOfRunsScored = 20000;
        bat.battingStrike = 80;
        bat.battingAverage = 58;
        SachinTendulkar sachin = new SachinTendulkar("Sachin Tendulkar", "Sachin", "01/01/1975","RHB", bat);
        System.out.println(sachin);

        SachinTendulkar sachin1 = new SachinTendulkar("Sachin Tendulkar", "Sachin", "01/01/1975","RHB");
        System.out.println(sachin1);

        BowlingStatistics bowling = new BowlingStatistics();
        bowling.gameFormat = "Test";
        bowling.noOfMatchesPlayed = 120;
        bowling.noOfWickets = 100;
        bowling.bowlingEconomy = 30;
        SachinTendulkar sachinBowling = new SachinTendulkar("Sachin", "Sachin", "01/01/1975", bowling);
        System.out.println(sachinBowling);
        SachinTendulkar sachinBowling1 = new SachinTendulkar("Sachin", "Sachin", "01/01/1975");
        System.out.println(sachinBowling1);


    }
}
