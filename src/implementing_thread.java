import java.util.Scanner;

class Demo implements Runnable{
	Scanner scanner=new Scanner(System.in);

	@Override
	public void run() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b);
		for (int i = 102; true; i=i+5) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
class Demo2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0;true; i++) {
			System.out.println(i);
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}
}
public class implementing_thread {
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo2 d1 = new Demo2();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d1);

		t1.start();
		t2.start();

	}
}
