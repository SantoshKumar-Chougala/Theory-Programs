import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter3 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\File_handling\\Text.txt");
//		System.out.println(file.exists());
		Scanner scanner = new Scanner(System.in);
		String s= scanner.nextLine();
		FileWriter fileWriter = new FileWriter(file,true);
		fileWriter.write(s+System.lineSeparator());
		fileWriter.flush();


	}
}
