package computer;

import computer.memory.RAM;
import computer.memory.ROM;
import computer.processes.CPU_Process;
import computer.processors.IntelProcessor;
import computer.storage.HDD;
import computer.storage.SSD;

import java.util.ArrayList;

public class computerClass {
    ArrayList<HDD> hdd_list;
    ArrayList<SSD> ssd_list;
    ArrayList<RAM> ram_list;
    ROM rom;
    ArrayList<CPU_Process> cpu_proc_list;
    ArrayList<IntelProcessor> processors_list;

    public computerClass(ROM rom) {
        this.rom = rom;
    }
    public void add_ssd(SSD my_ssd)
    {
        this.ssd_list.add(my_ssd);
    }
    public void add_hdd(HDD my_hdd)
    {
        this.hdd_list.add(my_hdd);
    }
    public void add_ram(RAM my_ram)
    {
        this.ram_list.add(my_ram);
    }
    public void add_process(CPU_Process my_proc)
    {
        this.cpu_proc_list.add(my_proc);
    }
    public void add_processor(IntelProcessor my_processor)
    {
        this.processors_list.add(my_processor);
    }

    public ArrayList<HDD> getHdd_list() {
        return hdd_list;
    }

    public ArrayList<SSD> getSsd_list() {
        return ssd_list;
    }

    public ArrayList<RAM> getRam_list() {
        return ram_list;
    }

    public ROM getRom() {
        return rom;
    }

    public ArrayList<CPU_Process> getCpu_proc_list() {
        return cpu_proc_list;
    }

    public ArrayList<IntelProcessor> getProcessors_list() {
        return processors_list;
    }
    public void delete_hdd(HDD rv_hdd)
    {
        this.hdd_list.remove(rv_hdd);
    }
    public void delete_ssd(SSD rv_ssd)
    {
        this.ssd_list.remove(rv_ssd);
    }
    public void delete_ram(RAM rv_ram)
    {
        this.ram_list.remove(rv_ram);
    }
    public void delete_proc(CPU_Process rv_cpu)
    {
        this.cpu_proc_list.remove(rv_cpu);
    }
    public void delete_processor(IntelProcessor rv_processor)
    {
        this.processors_list.remove(rv_processor);
    }



}
