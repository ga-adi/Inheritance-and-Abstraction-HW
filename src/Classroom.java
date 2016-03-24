import java.util.ArrayList;

/**
 * Created by Todo on 3/24/2016.
 */
public class Classroom implements ClassroomGrade {

    private Teacher teacher;
    private ArrayList<Student> students;

    @Override
    public void setGrade(int grade) {
        for (Student student:students) {
            student.setGrade(grade);
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
