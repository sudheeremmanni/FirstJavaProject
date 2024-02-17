package School;

import Marks.StudentSubject;

public class StudentMarks {
    public StudentSubject telugu;
    public StudentSubject hindi;
    public StudentSubject maths;
    public StudentSubject social;
    public StudentSubject science;
    public StudentSubject english;

    @Override
    public String toString() {
        return "StudentMarks{" +
                "telugu=" + telugu +
                ", hindi=" + hindi +
                ", maths=" + maths +
                ", social=" + social +
                ", science=" + science +
                ", english=" + english +
                '}';
    }
}


