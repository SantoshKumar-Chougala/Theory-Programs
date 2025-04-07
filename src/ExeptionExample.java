import java.io.IOException;

public class ExeptionExample {
    public static void main(String[] args) throws IOException {
        try {
            int a =4;
            int b=4;
            System.out.println(a/b);

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            staticMethodcall();
        } catch (Exception e) {
            throw new IOException();
        }
        finally {
            System.out.println("finally execute");
        }
        int a =10;
        int b=23;
        System.out.println(a+b);
        System.out.println("ststic method will be called");

    }

    private static void staticMethodcall()throws Exception {
        int a =10;
        int b=0;
        System.out.println(a+b);
        System.out.println("ststic method will be called");
    }

}
