import java.util.ArrayList;

/**
 * Created by JHADI on 3/21/16.
 */
public class Classroom {
    private Teacher teacher;
    private ArrayList<Student> students;
    public Classroom(Teacher teacher, ArrayList<Student> students){
        this.teacher = teacher;
        this.students=students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public interface PledgeOfAllegiance{
        public void singPledgeOfAllegiance();
    }
}
