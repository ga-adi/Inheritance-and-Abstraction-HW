/**
 * Created by JHADI on 3/21/16.
 */
public abstract class Person {

    String name;

    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void play();
    public abstract void rest();
}
