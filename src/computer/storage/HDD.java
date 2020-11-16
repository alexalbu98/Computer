package computer.storage;
import java.util.ArrayList;

public class HDD extends Storage_abstract {

    public HDD(int capacity,int speed) {
        this.capacity = capacity;
        this.speed=speed;
        this.stored_data = new ArrayList<Object>();
    }

}
