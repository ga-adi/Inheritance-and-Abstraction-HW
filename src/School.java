/**
 * Created by Todo on 3/24/2016.
 */
public class School {
    public static void main(){
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Classroom grade1 = new Classroom();
        Classroom grade2 = new Classroom();

        grade1.addStudent(student1);
        grade1.addStudent(student2);
        grade1.addStudent(student3);
        grade1.setTeacher(teacher1);

        grade2.addStudent(student4);
        grade2.addStudent(student5);
        grade2.setTeacher(teacher2);

        grade1.setGrade(1);
        grade2.setGrade(2);
    }
}
