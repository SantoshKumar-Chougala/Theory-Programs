import java.util.*;

public class StreamJava8 {
	public static void main(String[] args) {
//		List<String> name = new ArrayList<>();
//		name.add("Siddarth");
//		name.add("Pranith");
//		name.add("piyu");
//		name.add("arush");
//		name.add("vinu");
//
//		name.sort((s1,s2)->s1.compareTo(s2));
//		name.forEach(System.out::println);
		int[] ar ={1,2,3};
		for (int i=0;i< ar.length;i++){
			int product=1;
			for (int j=0;j< ar.length;j++){
				if(i!=j){
					product *=ar[j];
				}
			}
			ar[i]=product;
		}
		for (int a : ar){
			System.out.println(a);
		}
	}
}
