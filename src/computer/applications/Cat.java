package computer.applications;
import computer.interfaces.Application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cat implements Application {
    public String file;
    public Cat(){}
    public Cat(String filename)
    {
        file = filename;
    }
    /**
     * Reads the content of a file and displays it on the screen
     */
    @Override
    public void execute() {
        try {
            // read all bytes
            byte[] bytes = Files.readAllBytes(Paths.get(file));

            // convert bytes to string
            String content = new String(bytes);

            // print contents
            System.out.println(content);

        } catch (IOException ex) {
            System.out.printf("File %s was not found!", file);
        }
    }

}
