package String;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String n = "dakshin kumar";
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(n.toLowerCase(Locale.ROOT));//new object
        System.out.println(n.charAt(3));
        System.out.println(n.indexOf('a'));
        String b = "    dakshin";
        System.out.println(b.strip());//white spaces are romoved
        System.out.println(Arrays.toString(n.split(" ")));

    }
}
