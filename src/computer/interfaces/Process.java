package computer.interfaces;

public interface Process {
    void run(int core_id);
    void kill(int process_id);
}
