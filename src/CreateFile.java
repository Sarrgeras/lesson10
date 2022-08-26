import java.io.File;

public class CreateFile {

    public void createFile(){

        String nameDir = "D:/yury/lesson10/filesDirectory";
        File file = new File(nameDir);

        file.mkdir();
    }

}
