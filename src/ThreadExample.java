import java.util.Scanner;

class stall extends Exception implements Runnable {
	private String stallName;
	private  String detail;
	private  double stallArea;
	private  double stallCost;
	private  String owner;

	public stall(){
	}
	public stall(String stallName,String detail,double stallArea,double stallCost,String owner){
		this.stallName=stallName;
		this.detail=detail;
		this.stallArea=stallArea;
		this.stallCost=stallCost;
		this.owner=owner;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getStallArea() {
		return stallArea;
	}

	public void setStallArea(double stallArea) {
		this.stallArea = stallArea;
	}

	public double getStallCost() {
		return stallCost;
	}

	public void setStallCost(double stallCost) {
		this.stallCost = stallCost;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "stall{" +
				"stallName='" + stallName + '\'' +
				", detail='" + detail + '\'' +
				", stallArea=" + stallArea +
				", stallCost=" + stallCost +
				", owner='" + owner + '\'' +
				'}';
	}

	@Override
	public void run() {
		stallCost=stallArea*150;

	}
}

public class ThreadExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of detail: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		stall[] stalls = new stall[n];
		for (int i = 0; i < n; i++) {
			String s= scanner.nextLine();
			String[] split = s.split(",");
			stalls[i] = new stall(split[0],split[1],Double.parseDouble(split[2]),Double.parseDouble(split[3]),split[4]);
		}
		for (int i = 0; i < n; i++) {
			Thread thread = new Thread(stalls[i]);
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		double totalCost=0;
		for (int i=0;i<n;i++){
			totalCost+=stalls[i].getStallCost();
		}
		System.out.println(totalCost);


	}
}
