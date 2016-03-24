/**
 * Created by Todo on 3/24/2016.
 */
public class Teacher extends PersonInSchool {

    @Override
    public void schoolBehavior() {
        System.out.println("I am teaching");
        setTypeOfPerson("Teacher");
    }
}
