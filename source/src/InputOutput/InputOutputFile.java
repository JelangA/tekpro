package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputFile {

    public static void main(String[] args) {

        try {

            File file = new File("tes.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
