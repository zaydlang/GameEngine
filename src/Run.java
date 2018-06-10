import java.util.Timer;
import java.util.TimerTask;

public class Run {
    private Timer timer;
    private static Scene currentScene;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                update();
            }
        }, (1/60)*1000, (1/60)*1000);
        
        currentScene = new Main();
    }
    
    public static void update() {
        currentScene.update();
    }
    
    public static void switchScene(Scene newScene) {
        currentScene = newScene;
    }
}
