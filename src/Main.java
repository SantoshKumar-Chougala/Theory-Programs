import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Mapping days of the week to integers
		Map<String, Integer> dayMap = new HashMap<>();
		dayMap.put("mon", 0);
		dayMap.put("tue", 1);
		dayMap.put("wed", 2);
		dayMap.put("thu", 3);
		dayMap.put("fri", 4);
		dayMap.put("sat", 5);
		dayMap.put("sun", 6);

		// Read input
		String startDay = scanner.nextLine().trim().toLowerCase();
		int n = scanner.nextInt();
		scanner.close();

		// Determine the start day index
		int startIndex = dayMap.get(startDay);

		// Find the first Sunday from the start day
		int daysToFirstSunday = (7 - startIndex) % 7;

		// Check if the first Sunday is within the range of n days
		int countSundays = 0;
		if (daysToFirstSunday < n) {
			// Count Sundays starting from the first Sunday within the range
			countSundays = 1 + (n - daysToFirstSunday - 1) / 7;
		}

		System.out.println(countSundays);
	}
}
