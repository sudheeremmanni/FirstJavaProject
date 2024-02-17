package sachinconstructoroverloading;

public class SachinTendulkar {
    public String name;
    public String fatherName;
    public String dob;
    public String battingStyle;

    public BattingStatistics battingStats;
    public BowlingStatistics bowlingStats;

    public SachinTendulkar(String name, String fatherName, String dob, String battingStyle, BattingStatistics battingStats) {
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.battingStyle = battingStyle;
        this.battingStats = battingStats;
    }
    public SachinTendulkar(String name, String fatherName, String dob, BowlingStatistics bowlingStats) {
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.bowlingStats = bowlingStats;

    }

    public SachinTendulkar(String name, String fatherName, String dob, String battingStyle) {
        this(name,fatherName,dob,battingStyle,new BattingStatistics());
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.battingStyle = battingStyle;
    }

    public SachinTendulkar(String name, String fatherName, String dob) {
        this(name,fatherName,dob,new BowlingStatistics());
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;

    }

    @Override
    public String toString() {
        return "SachinTendulkar{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", battingStyle='" + battingStyle + '\'' +
                ", battingStats=" + battingStats +
                ", bowlingStats=" + bowlingStats +
                '}';
    }
}
