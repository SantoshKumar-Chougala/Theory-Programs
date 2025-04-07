import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		String dir="D:\\File_handling\\santosh.txt";
		File file = new File(dir);

		try{
			if(!file.exists()){
				file.createNewFile();
				System.out.println("file create sucess");
			}else {
				System.out.println("file already is there");
			}

		}catch (IOException e){
			e.printStackTrace();
		}

















		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		String fileName = file.getName();
		System.out.println(fileName);
		String parent = file.getParent();
		System.out.println(parent);

	}
}
