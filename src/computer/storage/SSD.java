package computer.storage;
import computer.interfaces.Storage;
import java.util.ArrayList;

public class SSD extends Storage_abstract {

    public SSD(int capacity,int speed) {
        this.capacity = capacity;
        this.speed=speed;
        this.stored_data = new ArrayList<Object>();
    }

}
