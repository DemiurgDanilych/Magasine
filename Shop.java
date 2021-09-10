import java.util.concurrent.atomic.AtomicInteger;

public class Shop implements Runnable{
	private static int OPERATION = 10;
	static AtomicInteger result = new AtomicInteger();
	
	
	@Override
	public void run() {
		fillAndAdd();
	}
	
	private void fillAndAdd() {
		for (int i = 0; i < OPERATION; i++){
			result.incrementAndGet();
		}
	}
	
	public static int getCurrent(){
		return result.get();
	}
	

}
