package class1Intro;
import java.util.Calendar;
import java.util.Scanner;
public class _3AskAge {

    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("Your age is " + age);


        //Find Date of Birth
        System.out.println("Please provide DOB in the format: YYYY-MM-DD");
        Scanner s = new Scanner(System.in);
        String dob = s.nextLine();  //1990-02-14
        int yearInput = Integer.parseInt(dob.substring(0,4));  //1990
        int currentyear = Calendar.getInstance().get((Calendar.YEAR));  //2019
        System.out.println("You are " + (currentyear-yearInput) +"Years old");



    }

}
