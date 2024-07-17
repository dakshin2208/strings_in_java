package String;

public class Palindrom {
    public static void main(String[] args) {
        String str = "abcefcba";
        System.out.println(palindrom(str));

    }
    static boolean palindrom (String str){
        if(str == null || str == "0"){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end) {
                return false;
            }

        }
        return true;
    }
}
