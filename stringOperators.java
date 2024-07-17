package String;

import java.util.ArrayList;

public class stringOperators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("A"+1);
        //this is same as after a few steps : '"a"+1
        //complex statement
        System.out.println("Dakshin" + new ArrayList<>()); //inside if value == null return[]
        System.out.println("dakshin" + new Integer(17));

        //only one condition is at least one of these object must be type string;
        System.out.println(new Integer(17 )+ "" + new Integer(33));
        System.out.println(new Integer(17 )+ "" + new ArrayList<>());

        String ans =  new Integer(17 )+ "" +  new ArrayList<>();
        System.out.println(ans);
    }
}
