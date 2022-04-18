import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Dictionary {
    HashSet<String> dictionary = new HashSet<>();
    Dictionary(){
        try {
            Scanner scanner = new Scanner(new File("Dictionar.txt"));
            while(scanner.hasNext()){
                dictionary.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
