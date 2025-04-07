import java.io.*;

public class ReaderFile {
	public static void main(String[] args) {
		String path="D:\\File_handling\\file.txt";
		File file = new File("D:\\File_handling\\file.txt");
		boolean exists = file.exists();
		write_File(file);
		reader_File(file);



	}

	private static void reader_File(File file) {

		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while ((line= br.readLine()) != null){
				System.out.println(line);
			}

		}catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	private static void write_File(File file) {
		String content="Hii santosh supriya kolli \n" +
				"sakkl";
		try (FileWriter fw=new FileWriter(file)){
			fw.write(content);


		} catch (IOException e) {
			System.err.print(e.getMessage());
		}
	}
}
