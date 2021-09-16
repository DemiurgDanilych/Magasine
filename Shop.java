import java.util.concurrent.atomic.LongAdder;

public class Shop implements Runnable{
	
	public static LongAdder revenueAllMagazine = new LongAdder();
	public static int OPERATION = 10;
	private LongAdder revenuesOneMagazine = new LongAdder();
	
	
	@Override
	public void run() {
		fillAndAdd();
	}
	
	private void fillAndAdd() {
		for (int i = 1; i < OPERATION; i++){
			revenuesOneMagazine.add(i);
		}
		revenueAllMagazine.add(revenuesOneMagazine.sum());
	}
	
	public static void printResult(){
		System.out.println("Выручка всех магазинов за день " + revenueAllMagazine.sum());
	}
	

}
