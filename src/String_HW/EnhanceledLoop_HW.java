package String_HW;

import apple.laf.JRSUIConstants;

import java.util.Scanner;

public class EnhanceledLoop_HW {
    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your username");
        String actualUsername = scan1.nextLine();
        String expectedUsername = "Ruslan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String actualPassword = scan.nextLine();
        String expectedPassword = "technosoft";


        for (int i = 0; i < 5; i++) {
            if (!actualPassword.equals(expectedPassword) && !actualUsername.equals(expectedUsername)) {
                int count = 5 - i;
                System.out.println("Please enter the valid username and password");
                System.out.println("You have " + count + "more tries");
                System.out.println("Please enter valid username");
                actualUsername = scan1.nextLine();
                System.out.println("Please enter valid password");
                actualPassword = scan.nextLine();
                if (i == 5) {
                    System.out.println("Your account will be locked for 10 min");
                }

            } else if (!actualPassword.equals(expectedPassword) || !actualUsername.equals(expectedUsername)) {
                int count = 5 - i;

                System.out.println("Please enter the valid username and password");
                System.out.println("You have " + count + "more tries");
                System.out.println("Please enter valid username");
                actualUsername = scan1.nextLine();
                System.out.println("Please enter valid password");
                actualPassword = scan.nextLine();
                if (i == 5) {
                    System.out.println("Your account will be locked for 10 min");
                } else {
                    System.out.println("Welcome to home page");
                    break;
                }
            }
        }
    }
}
// i dont know why but it doesnt print "locked account" after 5 tries. probably i put else statement at wrong position. just couldnt figure it out