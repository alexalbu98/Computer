package computer;
import computer.interfaces.Process;
import computer.memory.RAM;
import computer.memory.ROM;
import computer.processes.CPU_Process;
import computer.processors.IntelProcessor;

import computer.storage.HDD;
import computer.storage.SSD;

public class Main {

    public static void main(String[] args) {

        CPU_Process proc = new CPU_Process("test", "test");
        System.out.printf("%d\n", proc.getProcess_id());
        CPU_Process proc2 = new CPU_Process("test2", "test2");
        System.out.printf("%d\n", proc2.getProcess_id());
        HDD my_hdd=new HDD(100,200);
        SSD my_ssd=new SSD(200,300);
        RAM my_ram=new RAM(300,200);
        ROM my_rom=new ROM(200,400);
        Object my_obj=new CPU_Process("test","test");
        my_hdd.write(my_obj);
        
    }
}
