import java.util.ArrayList;

/**
 * Created by nat on 3/22/16.
 */
public class Driver {

    public static void main(String args[]){
        //create the school
        SpringfieldElementary school = new SpringfieldElementary();
        //create the classrooms
        Classroom firstGrade = new Classroom("firstGrade",101);
        Student firstGrader_bob = new Student("firstGrader_BOB",1);
        Teacher firstGradeTeacher = new Teacher("Ms.FirstGrade");
        firstGradeTeacher.addStudent((firstGrader_bob));
        firstGrade.addPersonToRoom(firstGradeTeacher);
        firstGrade.addPersonToRoom(firstGrader_bob);

        Classroom secondGrade = new Classroom("secondGrade",102);
        Student secondGrader_ted = new Student("secondGrader_ted",2);
        Teacher secondGradeTeacher = new Teacher("Ms. SecondGrade");
        secondGradeTeacher.addStudent(secondGrader_ted);
        secondGrade.addPersonToRoom(secondGrader_ted);
        secondGrade.addPersonToRoom(secondGradeTeacher);

        //create the teachers lounge
        TeachersLounge teachersLounge = new TeachersLounge("firstFloorLounge",200);
        //add rooms to school
        school.addRoom(teachersLounge);
        school.addRoom(firstGrade);
        school.addRoom(secondGrade);
        ArrayList<Room>schoolRooms = school.getRooms();
        for(int i=0;i<schoolRooms.size();i++){
            Room r = schoolRooms.get(i);

            System.out.println("ROOM: "+r.getmRoomName()+" room: "+r.getmRoomNo());
            System.out.println("People in room:");
            r.printPeopleInRoom();

            ArrayList<Person>personsInRoom = r.getPeopleInRoom();
            for(int j=0;j<personsInRoom.size();j++){
                Person p = personsInRoom.get(j);
                if(p instanceof Teacher){
                    System.out.println("FOUND TEACHER");
                    Teacher t = (Teacher)p;
                    System.out.println("teacher name:"+t.getName());
                    ArrayList<Student>students = t.getStudents();
                    for(int k=0;k<students.size();k++){
                        System.out.println("Student: "+students.get(k).getName());
                    }
                }else{

                }
            }

        }
    }
}
