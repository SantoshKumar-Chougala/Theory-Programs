@FunctionalInterface
interface cal{
	void add(int a,int b);
}

public class Functionl_Interface {
	public static void main(String[] args) {
		cal c = new cal() {
			@Override
			public void add(int a,int b) {
				System.out.println(1+2);
			}
		};
		c.add(2,4);

		cal c1 = (a,b) -> System.out.println(1+2); // cal c1 = (a,b)-> a+b; it will take automatically retun  
		c1.add(1,3);


	}
}
