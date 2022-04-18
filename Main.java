import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Game game = new Game(5);
        ArrayList<Thread> threads = new ArrayList<>();
        PlayerThread playThread1 = new PlayerThread(1, game);
        PlayerThread playThread2 = new PlayerThread(2, game);
        PlayerThread playThread3 = new PlayerThread(3, game);
        PlayerThread playThread4 = new PlayerThread(4, game);
        PlayerThread playThread5 = new PlayerThread(5, game);

        //Dictionary dictionary = new Dictionary();


        Thread Thr1 = new Thread(playThread1);
        Thread Thr2 = new Thread(playThread2);
        Thread Thr3 = new Thread(playThread3);
        Thread Thr4 = new Thread(playThread4);
        Thread Thr5 = new Thread(playThread5);
        threads.add(Thr1);
        threads.add(Thr2);
        threads.add(Thr3);
        threads.add(Thr4);
        threads.add(Thr5);
        Timer timer = new Timer(threads);

        Thr1.start();
        Thr2.start();
        Thr3.start();
        Thr4.start();
        Thr5.start();
        timer.setDaemon(true);
        timer.start();
        for(Thread thread: threads){
            try{
                thread.join();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        int winnerPoints = 0;
        int winnerIndex = -2;
        for(Player player : game.getPlayers()){
            if(player.points > winnerPoints){
                winnerIndex = game.getPlayers().indexOf(player);
            }
        }
        winnerIndex++;
        System.out.println("winner:" + winnerIndex);
    }
}
