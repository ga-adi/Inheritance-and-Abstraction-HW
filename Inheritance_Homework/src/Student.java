/**
 * Created by maratmamin on 3/21/16.
 */
public class Student implements IOccupy {
    @Override
    public void working() {
        System.out.println("Please quiet down!");
    }

    @Override
    public void sitting() {
        System.out.println("Everyone is seated");
    }

    @Override
    public void writing() {
        System.out.println("Something important is being said");
    }

    @Override
    public void answering() {

    }
}
