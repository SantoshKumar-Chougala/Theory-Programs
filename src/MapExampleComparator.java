import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExampleComparator {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>(Comparator.comparingInt(s -> ).reversed());

        map.put(new Student(101, "Computer Science", 8.5), "Alice");
        map.put(new Student(102, "Mechanical", 7.8), "Bob");
        map.put(new Student(103, "Electronics", 9.0), "Charlie");
        map.put(new Student(104, "Civil", 7.5), "David");
        map.put(new Student(105, "Electrical", 8.2), "Eve");

        for (Map.Entry<Student,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }


    }
}
