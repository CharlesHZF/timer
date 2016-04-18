
import com.importsource.timer.Timer;
import com.importsource.timer.TimerTask;

public class TimerDemo2 {
	public static void main(String[] args) {
		Timer timer = new Timer();
			timer.schedule(new MyTask(), 1000, 2000);
		
	}

}
class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("dddd");

	}

}
