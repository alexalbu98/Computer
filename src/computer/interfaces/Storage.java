package computer.interfaces;

import java.util.ArrayList;

public interface Storage {

    public void write();
    public void delete();
    public void read();
    public void add_to_list(Object stored_data);
    public void remove_from_list(Object stored_data);
    public int getCapacity();
    public ArrayList<Object> getStored_data();

}
