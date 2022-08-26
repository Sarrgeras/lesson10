import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerRunner {
    public void runScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число..");
        int first = scanner.nextInt();
        System.out.println("Введите второе число..");
        int second = scanner.nextInt();
        System.out.println("Сумма двух чисел = " + (first + second));

    }

    public void runFileScanner(){
        Scanner scanner = null;
        File file = new File("resources/test.txt");
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
