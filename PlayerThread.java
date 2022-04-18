import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PlayerThread implements Runnable {
    Integer threadName;
    Game game;
    public void run() {
        int x = 0;
        //System.out.println(threadName);
        while(x == 0){
            //System.out.println("aaa");
            synchronized (game){
                if (threadName.equals(game.getTurn())) {
                    System.out.println("Sunt thread-ul " + threadName);
                    if(game.getTurn() < game.getNumberOfPlayers()){
                        game.setTurn(game.getTurn()+1);
                    }
                    else {
                        game.setTurn(1);
                    }
                    Scanner keyboard = new Scanner(System.in);
                    game.getPlayers().get(threadName-1).showTiles();
                    System.out.println("Litere in sac: " + game.bag.getBag().size());
                    System.out.println("Scrie cuvant: ");
                    String input = keyboard.nextLine();
                    if(game.getPlayers().get(threadName-1).checkWord(input).compareTo("-0")!=0){
                        if(game.getPlayers().get(threadName-1).checkWord(input).compareTo("-change")==0){
                            game.getPlayers().get(threadName-1).changeTiles(game.bag);
                        }
                        else {
                            if (game.getDictionary().dictionary.contains((game.getPlayers().get(threadName - 1).checkWord(input)).toLowerCase(Locale.ROOT))) {
                                System.out.println("Cuvant corect!");
                                game.getPlayers().get(threadName - 1).addPointsForWord(input);
                                game.getPlayers().get(threadName - 1).addTiles(game.bag, input.length());
                                game.checkEndGame();
                            } else {
                                System.out.println("Nu este in dictionar");
                            }
                        }
                    }
                    else{
                        System.out.println("Litere indisponibile!");
                    }
                    game.notifyAll();
                    /*
                    if(game.endGame != false) {
                        try {
                            game.wait();
                        } catch (InterruptedException e) {
                            System.out.println("got interrupted!");
                        }
                    }*/
                    if(game.endGame) {
                        x = 1;
                    }
                }
                /*
                else{
                    game.notifyAll();
                    try {
                        game.wait();
                    }
                    catch (InterruptedException e) {
                        System.out.println("got interrupted!");
                    }
                }*/
            }
        }
    }

    PlayerThread(Integer name, Game game){
        this.game = game;
        this.threadName = name;
    }
}

