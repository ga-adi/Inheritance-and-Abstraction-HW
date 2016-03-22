import java.util.ArrayList;

/**
 * Created by JHADI on 3/21/16.
 */
public class Student extends Person implements Classroom.PledgeOfAllegiance{
    int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public void play() {
        System.out.println(name + " jumps up and down and runs around.");
    }

    @Override
    public void rest() {
        System.out.println(name + " takes nap.");
    }

    @Override
    public void singPledgeOfAllegiance() {
        System.out.println("I pledge allegiance...");
    }
}
