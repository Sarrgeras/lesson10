import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputStreamRunner {
    public void runOutput() throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try(FileOutputStream fileOutputStream = new FileOutputStream(file, true)){
            String hello = "Hello Java";
            fileOutputStream.write(hello.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(System.lineSeparator().getBytes());

        }
    }
}
