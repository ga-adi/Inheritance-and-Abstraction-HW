/**
 * Created by nat on 3/22/16.
 */
public abstract class Person {
    String name;

    public Person(String n){
        name=n;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void doSchoolActivity();
}
