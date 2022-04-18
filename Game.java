import java.util.ArrayList;

public class Game{
    int turn;
    int numberOfPlayers;
    ArrayList<Player> players = new ArrayList<>();
    Dictionary dictionary = new Dictionary();
    Bag bag = new Bag();
    boolean endGame = false;

    public Game(int players) {
        this.turn = 1;
        this.numberOfPlayers = players;
        for(int i =0; i < players; i++){
            this.players.add(new Player(bag));
        }
    }

    public void checkEndGame(){
        if(bag.getBag().size() <= 0){
            endGame = true;
        }
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }
}
