import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile();

        createFile.createFile();

        FileRunner fileRunner = new FileRunner();

        fileRunner.runFile();

        InputStreamRunner inputStreamRunner = new InputStreamRunner();

        inputStreamRunner.runInput();

        OutputStreamRunner outputStreamRunner = new OutputStreamRunner();

        outputStreamRunner.runOutput();

        ReaderRunner readerRunner = new ReaderRunner();
        System.out.println();
        readerRunner.runReader();

        WriterRunner writerRunner = new WriterRunner();

        writerRunner.runWriter();

        FilesRunner filesRunner = new FilesRunner();

        filesRunner.runFiles();
    }
}
