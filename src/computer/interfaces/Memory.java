package computer.interfaces;

import java.util.ArrayList;

public interface Memory{
    public void write(Object mem_data);
    public void delete(Object mem_data);
    public void read(int index);
    public int getCapacity();
    public ArrayList<Object> getMem_data();
    public int getSpeed();
}
