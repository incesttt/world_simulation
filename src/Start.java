import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Start {
    static Timer timer = new Timer();

    static class Task extends TimerTask {
        @Override
        public void run () {
            int delay = (5 + new Random().nextInt(5)) * 1000;
            timer.schedule(new Task(), delay);
            System.out.println(new Date());
        }
    }

    public static void main(String[] args) throws Expection {
        new Task().run();

    }
}
