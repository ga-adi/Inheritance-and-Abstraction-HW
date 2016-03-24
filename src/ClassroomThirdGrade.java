/**
 * Created by charlie on 3/24/16.
 */
public class ClassroomThirdGrade extends Classroom {

    /**
     * NO nap for third grade classes
     */
    @Override
    void napTime() {
        System.out.println("No nap for you!");
    }
}
