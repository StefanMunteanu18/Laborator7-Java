import java.util.ArrayList;

public class Timer extends Thread{
    int time = 100;
    ArrayList<Thread> threads = new ArrayList<>();
    Timer(ArrayList<Thread> threads){
        this.threads=threads;
    }
    public void run(){
        while(time >0){
            if(time % 10 == 0) {
                System.out.println("Timp ramas: " + time);
            }
            try {
                Thread.sleep(1000); // sleep/stop a thread for 1 second
            } catch(InterruptedException e) {
                System.out.println("An Excetion occured: " + e);
            }
            time--;
        }
        for(Thread thread : threads){
            thread.stop();
        }
    }
}
