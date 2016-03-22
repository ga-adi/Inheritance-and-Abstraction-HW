import java.util.ArrayList;

/**
 * Created by nat on 3/22/16.
 */
public  class Teacher extends Person {

    private String name;
    private ArrayList<Student>mStudents;

    public Teacher(String name){
        super(name);
        mStudents = new ArrayList<>();
    }

    @Override
    public void doSchoolActivity() {
        System.out.println("teach");
    }


    public void addStudent(Student s){
        mStudents.add(s);
    }

    public ArrayList<Student> getStudents(){
        return mStudents;
    }
}
