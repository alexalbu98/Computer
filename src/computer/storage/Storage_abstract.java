package computer.storage;
import computer.interfaces.Storage;
import java.util.ArrayList;

abstract class Storage_abstract implements Storage {
    int capacity;
    ArrayList<Object> stored_data;
    int speed;

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getSpeed() {
        return speed;
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
