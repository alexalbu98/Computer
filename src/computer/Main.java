package computer;
import computer.processors.IntelProcessor;

public class Main {

    public static void main(String[] args) {

        IntelProcessor my_processor = new IntelProcessor(2000, 4);
        System.out.println(my_processor.add(2,3));
        System.out.println(my_processor.devide(4,2));

    }
}
