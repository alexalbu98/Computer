package computer.memory;

import java.util.ArrayList;

public class RAM extends Memory_abstract {

    @Override
    public void write(Object mem_data) {
        this.mem_data.add(mem_data);
    }

    public RAM(int capacity,int speed) {
        this.capacity=capacity;
        this.speed=speed;
        this.mem_data=new ArrayList<Object>();
    }

}
