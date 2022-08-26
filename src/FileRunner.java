import java.io.File;
import java.io.IOException;

public class FileRunner {

    public void runFile() throws IOException {
        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.isFile());
        System.out.println(file.canWrite());

    }
}
