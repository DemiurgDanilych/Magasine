import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Shop shop1 = new Shop();
		Shop shop2 = new Shop();
		Shop shop3 = new Shop();
		
		
		Thread thread1 = new Thread(null, shop1,"Магазин 1");
		Thread thread2 = new Thread(null, shop2,"Магазин 1");
		Thread thread3 = new Thread(null, shop3,"Магазин 1");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		Shop.printResult();
	}
}
