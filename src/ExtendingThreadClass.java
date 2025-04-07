import java.util.Scanner;

class test extends Thread{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void run() {
		int a =scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+b);
	}
}
class  test2 extends  Thread{
	@Override
	public void run() {
		for (int i=1;i<=10;i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

public class ExtendingThreadClass {

	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		test t1 = new test();
		test2 t2 = new test2();

		t1.start();
		t2.start();



	}





}
