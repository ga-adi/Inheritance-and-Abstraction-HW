import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by JHADI on 3/21/16.
 */
public class School {


    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("student1",1), new Student("student2",1),new Student("student3",1), new GeniusStudent("Student4",1)};
        Student[] students2 = new Student[]{new Student("student1",2), new Student("student2",2),new Student("student3",2), new GeniusStudent("Student4",2)};
        Student[] students3 = new Student[]{new Student("student1",3), new Student("student2",3),new Student("student3",3), new GeniusStudent("Student4",3)};
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Student> studentList2 = new ArrayList<>();
        ArrayList<Student> studentList3= new ArrayList<>();
        studentList.addAll(Arrays.asList(students));
        studentList2.addAll(Arrays.asList(students));
        studentList3.addAll(Arrays.asList(students));

        //First grade classroom
        Classroom firstGradeClassroom = new Classroom(new Teacher("Jones"), studentList);
        Classroom secondGradeClassroom = new Classroom(new Teacher("Phelps"), studentList2);
        Classroom thirdGradeClassroom = new Classroom(new Teacher("Kelly"), studentList3);
        Classroom[] classes = new Classroom[]{firstGradeClassroom,secondGradeClassroom,thirdGradeClassroom};
        for (Classroom classroom: classes){
            classroom.getTeacher().play();
            classroom.getTeacher().rest();
            for (Student student: classroom.getStudents()){
                student.play();
                student.rest();
                student.singPledgeOfAllegiance();
            }
        }

    }
}
