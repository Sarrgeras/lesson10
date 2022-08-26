import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {

    public void runInput(){
        //File file = new File("resources/test.txt");
        //String resources = String.join(File.separator, "resources", "test");
        File file = Path.of("resources", "test.txt").toFile();

        try (FileInputStream fileInputStream = new FileInputStream(file)){
            //Вариант 1
            //byte[] bytes = fileInputStream.readAllBytes();
            //String str = new String(bytes);
            //System.out.println(str);
            //Вариант 2
            byte[] buffer = new byte[fileInputStream.available()];
            int count = 0;
            byte currentByte;

            while ((currentByte = (byte) fileInputStream.read()) != -1){
                buffer[count++] = currentByte;
            }

            String s = new String(buffer);
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }

}
