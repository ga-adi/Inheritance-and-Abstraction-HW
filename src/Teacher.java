/**
 * Created by charlie on 3/24/16.
 */
public class Teacher implements Person {
    private int salary;

    /**
     * For teachers, promotion means more $
     */
    @Override
    public void promote() {
        salary += 2000;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
