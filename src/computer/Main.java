package computer;
import computer.interfaces.Process;
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

    }
}
