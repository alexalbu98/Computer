package computer.memory;

import java.util.ArrayList;

public class ROM extends Memory_abstract{

    @Override
    public void write(Object mem_data) {
        return ;
    }

    public ROM(int capacity,int speed) {
        this.capacity=capacity;
        this.speed=speed;
        this.mem_data=new ArrayList<Object>();
    }

}
