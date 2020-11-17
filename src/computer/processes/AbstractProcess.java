package computer.processes;

import computer.interfaces.Process;

public abstract class AbstractProcess implements Process {
    private String process_instructions;
    private String process_name;
    static private int id_generator = 0;
    private final int process_id;

    public AbstractProcess(){
        process_id = id_generator;
        id_generator++;
    }
    public AbstractProcess(String instruction, String name)
    {
        process_instructions = instruction;
        process_name = name;
        process_id = id_generator;
        id_generator++;
    }

    @Override
    public void run(int core_id) {
        System.out.printf("Process %s started on core %d\n", process_name, core_id);
    }

    @Override
    public void kill(int process_id) {
        System.out.printf("Killing process %s", process_name);
    }

    //Getter region
    public String getProcess_instructions() {
        return process_instructions;
    }

    public int getProcess_id() {
        return process_id;
    }

    //Setter region

    public void setProcess_instructions(String process_instructions) {
        this.process_instructions = process_instructions;
    }
}
