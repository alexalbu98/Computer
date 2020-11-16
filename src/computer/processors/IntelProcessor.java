package computer.processors;
import computer.exceptions.DivideByZeroException;
import computer.interfaces.Processor;

public class IntelProcessor implements Processor {

    private int processor_speed;
    private int n_cores;
    private final String type;

    public IntelProcessor(){
        type = "Intel";
    }
    public IntelProcessor(int speed, int cores)
    {
        processor_speed = speed;
        n_cores = cores;
        type = "Intel";
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        try {
            if (b == 0) {
                throw new DivideByZeroException("Cannot divide by zero!");
            }
        }catch (DivideByZeroException exp){
            System.out.println(exp.getMessage());
            return -1;
        }
        return a/b;
    }

    @Override
    public int to_power(int number, int pwr) {
        int result = 1;
        for(int i=0; i< pwr ; i++)
        {
            result  = result*number;
        }
        return  result;
    }

    /**
     * Executes a process on one core
     * @return returns the execution code
     */
    @Override
    public int run_process() {
        return 0;
    }

    //Getter region
    public int getN_cores() {
        return n_cores;
    }

    public int getProcessor_speed() {
        return processor_speed;
    }

    public String getType() {
        return type;
    }

}
