package computer;
import computer.applications.Cat;
import computer.interfaces.Application;
import computer.interfaces.Process;
import computer.memory.RAM;
import computer.memory.ROM;
import computer.processes.CPU_Process;
import computer.processors.IntelProcessor;

import computer.storage.HDD;
import computer.storage.SSD;

public class Main {

    public static void main(String[] args) {

        ROM my_rom= new ROM(200,400);
        computerClass my_computer=new computerClass(my_rom);
        SSD my_ssd =new SSD(100,200);
        HDD my_hdd =new HDD(200,300);
        RAM my_ram=new RAM(500,200);
        CPU_Process my_cpu=new CPU_Process("test","test");
        IntelProcessor my_intel =new IntelProcessor(500,4);
        IntelProcessor new_intel=new IntelProcessor(200,2);
        my_computer.add_hdd(my_hdd);
        my_computer.add_ssd(my_ssd);
        my_computer.add_process(my_cpu);
        my_computer.add_processor(my_intel);
        my_computer.add_ram(my_ram);

        my_computer.delete_processor(new_intel);

    }
}
