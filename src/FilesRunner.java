import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesRunner {
    public void runFiles() throws IOException {
        Path path = Path.of("resources", "testWriter.txt");
        //try (BufferedWriter writer = Files.newBufferedWriter(path)){
        // writer.append("Hello");
        // writer.newLine();
        // writer.append("World");
        //}

        Files.write(path, List.of("Hello", "Java"));

        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);
    }
}
