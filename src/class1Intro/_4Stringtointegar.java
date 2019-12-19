package class1Intro;
import java.util.Scanner;
public class _4Stringtointegar {

    public static void main(String[] args) {
        // To convert string to integar.

        System.out.println("Please enter your age");
        Scanner scan = new Scanner(System.in);
        String age = scan.nextLine();
        int intAge = Integer.parseInt(age);
        System.out.println("Your age will be " + (intAge + 5) + " after 5 years");

    }




}
