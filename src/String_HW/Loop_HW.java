package String_HW;

import java.util.Scanner;

public class Loop_HW {
    public static void main(String[] args) {

        //1.Students score, total possible score
        // 15/20 -> You got a C (75%)
        // A 90-100, B 80-89, C 70-79, D 60-69, F 0-59


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");

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


        //2. Write a logic that prints multiplication table of the user provided number upto ten.


        int number1 = 1;
        int number2 = 1;
        for(number1 = 1; number1 <=10; number1++){
            for(number2 = 1; number2 <=10; number2++){
                System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
            }
        }


//Write a logic that checks if a number is a Prime number
        // I mostly took this one from internet..

        int number;
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");

        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            number=num%i;
            if(number==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");



    }
}
