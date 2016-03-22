/**
 * Created by JHADI on 3/21/16.
 */
public class GeniusStudent extends Student{

    public GeniusStudent(String name, int grade) {
        super(name, grade);
    }

    @Override
    public void play() {
        System.out.println(name + " studies.");
    }

    @Override
    public void rest() {
        System.out.println(name + " studies more");
    }
}
