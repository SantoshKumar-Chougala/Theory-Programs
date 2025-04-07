import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		char[] ar = new char[100];
		FileReader Reader = new FileReader("D:\\File_handling\\Text.txt");
		Reader.read(ar);
		System.out.println(ar);

	}
}
