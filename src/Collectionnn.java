import java.util.ArrayList;
import java.util.List;

public class Collectionnn {
	public static void main(String[] args) {
//		List<Character> list = new ArrayList<>();
//		list.add('a');
//		list.add('b');
//		list.add('c');
//		list.add('d');
//		System.out.println(list);
//		list.remove(Character.valueOf('c'));
//		System.out.println(list);
//		String s ="java";
//		s.concat(" rock!");
//		System.out.println(s);
		String[] ar = {"5099","60","38","90"};
		for (String s : ar){
			if (!s.contains("9")){
				System.out.println(s);
			}
		}
	}
}
