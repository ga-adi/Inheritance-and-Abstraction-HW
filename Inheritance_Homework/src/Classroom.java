/**
 * Created by maratmamin on 3/21/16.
 */
public abstract class Classroom {
    public int time; // = how much time remains in the class
    public int timeLeft;
    public int questionsLeftUnanswered;
    public int mNumberOfQuestionsAsked;

    public abstract void classStarts(int time);

    public int askQuestions(int numberOfQuestionsAsked) {
        mNumberOfQuestionsAsked = numberOfQuestionsAsked;
        return mNumberOfQuestionsAsked;
    }

    public abstract IOccupy getHelp(IOccupy nerd);
}
