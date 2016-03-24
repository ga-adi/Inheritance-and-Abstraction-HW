/**
 * Created by Todo on 3/24/2016.
 */
public class Student extends PersonInSchool {

    private int grade;

    @Override
    public void schoolBehavior() {
        System.out.println("I am learning");
        setTypeOfPerson("Student");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
