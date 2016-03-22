import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by nat on 3/22/16.
 */
public class Room {
    private int mRoomNo;
    private String mRoomName;
    private ArrayList<Person> mPeopleInRoom;

    public Room(int mRoomNo, String mRoomName) {
        this.mRoomNo = mRoomNo;
        this.mRoomName = mRoomName;
        mPeopleInRoom = new ArrayList<>();
    }

    public void addPersonToRoom(Person p){
        mPeopleInRoom.add(p);
    }
    public void printPeopleInRoom(){
        for(int i=0;i<mPeopleInRoom.size();i++){
            System.out.println(i+"."+mPeopleInRoom.get(i).getName());
        }
    }
    public ArrayList<Person> getPeopleInRoom(){
        return mPeopleInRoom;
    }
    public int getmRoomNo() {
        return mRoomNo;
    }

    public void setmRoomNo(int mRoomNo) {
        this.mRoomNo = mRoomNo;
    }

    public String getmRoomName() {
        return mRoomName;
    }

    public void setmRoomName(String mRoomName) {
        this.mRoomName = mRoomName;
    }
}
