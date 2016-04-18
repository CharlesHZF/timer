# timer
a simple timer tool


```java
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

```
