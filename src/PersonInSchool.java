/**
 * Created by Todo on 3/24/2016.
 */
public abstract class PersonInSchool {
    private String name;
    private String typeOfPerson;

    public abstract void schoolBehavior();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfPerson() {
        return typeOfPerson;
    }

    public void setTypeOfPerson(String typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }
}
