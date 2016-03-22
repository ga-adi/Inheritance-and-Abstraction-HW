import java.util.ArrayList;

/**
 * Created by nat on 3/22/16.
 */
public class SpringfieldElementary implements School {

    private ArrayList<Room>mRooms;

    public SpringfieldElementary(){
        mRooms = new ArrayList<>();
    }
    @Override
    public void addRoom(Room r) {
        mRooms.add(r);
    }

    @Override
    public int getNoOfRooms() {
        return mRooms.size();
    }

    @Override
    public ArrayList<Room> getRooms() {
        return mRooms;
    }
}
