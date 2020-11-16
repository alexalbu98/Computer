package computer.memory;

import computer.interfaces.Memory;

import java.util.ArrayList;

abstract class Memory_abstract implements Memory {

    int capacity;
    ArrayList<Object> mem_data;
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
    public ArrayList<Object> getMem_data() {
        return mem_data;
    }

    @Override
    public void delete(Object data_to_be_removed) {
        this.mem_data.remove(data_to_be_removed);
    }

    @Override
    public void read(int index) {
        System.out.println(this.mem_data.get(index));
    }
}
