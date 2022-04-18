import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Player {
    ArrayList<Tile> tiles = new ArrayList<>();
    int points;

    Player(Bag bag){
        points=0;
        int randomTile;
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            randomTile = rand.nextInt(bag.getBag().size());
            tiles.add(bag.getBag().remove(randomTile));
        }
    }
    public void showTiles(){
        for(Tile tile : tiles){
            System.out.println(tile.chr);
        }
    }

    public String checkWord(String str){
        if(str.length()>7){
            return "-0";
        }
        else {
            if(str.compareTo("-change") == 0){
                return str;
            }
            else {
                String regex = "[";
                ArrayList<Character> charList = new ArrayList<>();
                for (Tile tile : tiles) {
                    regex += tile.chr;
                    charList.add(tile.chr);
                }
                regex += "]+";
                if (str.matches(regex)) {
                    for (int i = 0; i < str.length(); i++) {
                        Character c = str.charAt(i);
                        if (charList.contains(c)) {
                            charList.remove(c);
                        } else {
                            return "-0";
                        }
                    }
                    return str;
                } else {
                    return "-0";
                }
            }
        }
    }

    public void changeTiles(Bag bag){
        int changetTiles = 0;
        int randomTile;
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            randomTile = rand.nextInt(bag.getBag().size());
            if(bag.getBag().size()>0) {
                tiles.add(bag.getBag().remove(randomTile));
                changetTiles ++;
            }
        }
        for(int i = 0; i < changetTiles; i++){
            bag.getBag().add(tiles.remove(i));
        }
    }

    public void addPointsForWord(String str){
        ArrayList<Integer> tilesIndexes = new ArrayList<>();
        for (Tile tile : tiles) {
            if (str.indexOf(tile.getChr()) >= 0) {
                tilesIndexes.add(tiles.indexOf(tile));
                points += tile.getPoints() * str.length();
            }
        }
        Collections.reverse(tilesIndexes);
        for (Integer index : tilesIndexes) {
            tiles.remove(index.intValue());
            System.out.println("REMOVED" + index.intValue());
        }
        System.out.println(points);
    }


    public void addTiles(Bag bag, int count){
        int randomTile;
        Random rand = new Random();
        for(int i = 0; i < count; i++){
            randomTile = rand.nextInt(bag.getBag().size());
            if(bag.getBag().size()>0) {
                tiles.add(bag.getBag().remove(randomTile));
            }
        }
    }
}
