/**
 * Created by maratmamin on 3/21/16.
 */
public class Main {
    public static void main(String[] args) {

        ClassroomGrade firstGrade = new ClassroomGrade();

        firstGrade.classStarts(firstGrade.time);
        Teacher teacher = new Teacher();
        Student marat = new Student();

        firstGrade.getHelp(teacher);
        marat.sitting();
        marat.writing();
        marat.working();
        teacher.answering();

    }
}
