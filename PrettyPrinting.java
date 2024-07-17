package String;

public class PrettyPrinting{
    public static void main(String[] args) {
        //how to print only two decimal points
        float a = 453.1234f;
//        System.out.printf("formatted number: %.2f",a);
      // formatted also round off the decimal number
        float b = 453.1274f;
//        System.out.printf("formatted number is %.2f",b);

        //need to print pi value
//        System.out.println(Math.PI);
//        System.out.printf("%.2f",Math.PI);


        //way to print string
        System.out.printf("Hello My Name is %s%n  and Iam so %s","Dakshin" ,"cool");
    }
}
