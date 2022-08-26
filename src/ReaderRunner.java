import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {
    public void runReader() throws IOException {
        File file = Path.of("resources", "test.txt").toFile();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String str = reader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(str);
        }


    }
}
