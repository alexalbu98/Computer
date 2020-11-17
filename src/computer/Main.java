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

        Application app = new Cat("C:\\Users\\Work\\IdeaProjects\\Project\\LICENSE");
        app.execute();

    }
}
