import java.util.List;

/**
 * Created by charlie on 3/24/16.
 */
public abstract class Classroom {
    private Teacher teacher;
    private List<Student> students;

    public int getClassSize() {
        return students.size();
    }

    abstract void napTime();
}
