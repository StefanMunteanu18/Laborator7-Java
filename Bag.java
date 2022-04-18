import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Bag {
    ArrayList<Tile> bag = new ArrayList<>();
    Bag(){
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('A', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('B', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('C', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('D', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('E', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('F', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('G', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('H', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('I', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('J', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('K', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('L', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('M', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('N', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('O', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('P', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('Q', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('R', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('S', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('T', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('U', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('V', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('W', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('X', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('Y', 5));
        }
        for(int i = 0; i < 5; i++){
            bag.add(new Tile('Z', 5));
        }
    }
    public ArrayList<Tile> getBag() {
        return bag;
    }
}

