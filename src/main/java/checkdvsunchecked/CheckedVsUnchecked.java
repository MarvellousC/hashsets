package checkdvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        readFile("myFile.txt");

    }

    private static void readFile(String fileName){ //this could throw a file not found exception (it's a checke exception, java won't compile until you deal with it

        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException fe){
            System.out.println("File not found "+fe.getMessage());
        }


    }
}
