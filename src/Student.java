/**
 * Created by charlie on 3/24/16.
 */
public class Student implements Person {
    private int gradeLevel;
    private double gpa;

    /**
     * For students, promotion means matriculating to next grade level
     */
    @Override
    public void promote() {
        gradeLevel += 1;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
