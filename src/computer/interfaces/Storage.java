package computer.interfaces;

import java.util.ArrayList;

public interface Storage {
    public void write(Object stored_data);
    public void delete(Object stored_data);
    public void read(int index);
    public int getCapacity();
    public ArrayList<Object> getStored_data();

}
