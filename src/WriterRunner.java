import java.io.*;
import java.nio.file.Path;

public class WriterRunner {
    public void runWriter() throws IOException {
        File file = Path.of("resources", "writer.txt").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.append("Hello Java");
            writer.newLine();
            writer.append("Hello Java");
            writer.newLine();
        }

    }
}
