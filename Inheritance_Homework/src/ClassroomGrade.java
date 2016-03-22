/**
 * Created by maratmamin on 3/21/16.
 */
public class ClassroomGrade extends Classroom {
    public int mTime;
    public int mNumberOfQuestionsAsked;

    @Override
    public void classStarts(int time) {
        mTime = time;
    }

    @Override
    public int askQuestions(int numberOfQuestionsAsked) {
        mNumberOfQuestionsAsked = numberOfQuestionsAsked;
        return mNumberOfQuestionsAsked;
    }

    @Override
    public IOccupy getHelp(IOccupy nerd) {
       return nerd;
    }
}
