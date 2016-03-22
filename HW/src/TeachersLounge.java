/**
 * Created by nat on 3/22/16.
 */
public class TeachersLounge extends Room {
    private int noOfCoffeeMakers=1;
    private int noOfCouches=2;

    public int getNoOfCoffeeMakers() {
        return noOfCoffeeMakers;
    }

    public void setNoOfCoffeeMakers(int noOfCoffeeMakers) {
        this.noOfCoffeeMakers = noOfCoffeeMakers;
    }

    public int getNoOfCouches() {
        return noOfCouches;
    }

    public void setNoOfCouches(int noOfCouches) {
        this.noOfCouches = noOfCouches;
    }

    public TeachersLounge(String name, int roomNo){
        super(roomNo,name);
    }
}
