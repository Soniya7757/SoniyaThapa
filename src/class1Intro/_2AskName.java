package class1Intro;

import java.util.Scanner;

public class _2AskName {

    public static void main(String[] args) {
        //To print Name
        System.out.println("Please enter your name");
        Scanner scan=new Scanner(System.in) ;
        String str=scan.nextLine();
        System.out.println("Welcome "+str);

    }
}
