package computer.storage;
import computer.interfaces.Storage;
import java.util.ArrayList;

public class SSD implements Storage {
    int capacity;
    ArrayList<Object> stored_data;

    public SSD(int capacity) {
        this.capacity = capacity;
        this.stored_data = new ArrayList<Object>();
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public ArrayList<Object> getStored_data() {
        return stored_data;
    }

    @Override
    public void write(Object new_stored_data)
    {
        this.stored_data.add(new_stored_data);
    }


    @Override
    public void delete(Object data_to_be_removed) {
        this.stored_data.remove(data_to_be_removed);
    }

    @Override
    public void read(int index) {
        System.out.println(this.stored_data.get(index));
    }
}
