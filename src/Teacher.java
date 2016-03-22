import java.util.ArrayList;

/**
 * Created by JHADI on 3/21/16.
 */
public class Teacher extends Person {


    public Teacher(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Mrs. "+ name + " plays on smartphone");
    }

    @Override
    public void rest() {
        System.out.println("Mrs. "+ name + " sits on chair.");
    }
}
