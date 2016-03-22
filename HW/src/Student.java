/**
 * Created by nat on 3/22/16.
 */
public  class Student extends Person{
    private String name;
    private int grade;

    public Student(String name,int grade){
        super(name);
        this.grade=grade;
    }



    public int getGradeLevel(){
        return grade;
    }

    @Override
    public void doSchoolActivity() {
        System.out.println("learn");
    }
}
