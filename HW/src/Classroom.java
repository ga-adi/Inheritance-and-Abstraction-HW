/**
 * Created by nat on 3/22/16.
 */
public class Classroom extends Room {

    int noOfDesks = 20;
    int noOfChalkBoards=2;

    public int getNoOfDesks() {
        return noOfDesks;
    }

    public void setNoOfDesks(int noOfDesks) {
        this.noOfDesks = noOfDesks;
    }

    public int getNoOfChalkBoards() {
        return noOfChalkBoards;
    }

    public void setNoOfChalkBoards(int noOfChalkBoards) {
        this.noOfChalkBoards = noOfChalkBoards;
    }

    public Classroom(String name, int roomNo){
        super(roomNo,name);
    }


}
