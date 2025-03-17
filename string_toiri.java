
import java.util.Scanner;

public class string_toiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "CSE110";
        System.out.println(s1);
        String s2 = new String(sc.nextLine());

        System.out.println(s2.length());

        System.out.println(s2.charAt(2)); // to see any char at that particular index
        System.out.println(s2.codePointAt(2)); // to see the aschii value 
    }
}
