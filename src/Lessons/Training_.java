package Lessons;

import java.util.Scanner;

public class Training_ {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");

        int num=scan.nextInt();


        int score = 15;
        int maxScore = 20;
        int percent = (score * 100) / maxScore;
        System.out.println("Your score is" + " " + percent + "%");

        if (percent >= 0 && percent <=59){
            System.out.println("Your grade is: " + "F");
        }else if(percent >= 60 && percent <= 69){
            System.out.println("Your grade is: " + "D" );
        }else if(percent >= 70 && percent <= 79) {
            System.out.println("Your grade is: " + "C");
        }else if(percent >= 80 && percent <= 89) {
            System.out.println("Your grade is: " + "B");
        }else if (percent >= 90 && percent <=100){
            System.out.println("Your grade is: " + "A");
        }else
        {
            System.out.println("Invalid score");
        }




    }


}
