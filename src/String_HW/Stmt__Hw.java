package String_HW;

import java.util.Scanner;

public class Stmt__Hw {
    public static void main(String[] args) {

        // 1. Menu
// boolean isGuestOneVegan = true;
// boolean isGuesttwoVegan = true;
// Are both vegan? only offer up vegan dishes.
// At least one vegan? make sure offer up some vegan options.
// Else, offer anything on the menu


        boolean isGuestOneVegan = true;
        boolean isGuesttwoVegan = true;

        if (isGuestOneVegan && isGuesttwoVegan) {
            System.out.println("Here is our Vegan Menu");

        }else if(isGuestOneVegan || isGuesttwoVegan){
                System.out.println("We have some vegan options for You");
            }
        else{
            System.out.println("Here is our Main menu");
        }


//        2. Driver Controller
// * I want to be able to put car on P mode, D mode, N mode, R mode
// * If i am on P mode and parking type is parallel then i can park between two cars
// * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
// * If i am on N mode i can put car in car wash station
// * If i am on R mode I can only reverse the car and car will activate back camera
// * If mode is incorrect then print me invalid mode type, please check your car mode


// I have a question here...
// Can I create here a new char here in order to do  "char.equals" instead of "==" ?
// For Example:      Character carMode = new Character('P');

        char carMode = 'P';
        String parkType = "Parallel";

        if (carMode == 'P')
        { System.out.println("Parking mode Activated");
            if (parkType.equals("Parallel"))
                System.out.println("Parallel parking Allowed");
        }
        else if (carMode == 'D') {
            System.out.println("Driving types available: Sport, Snow, Regular");
        }
        else if (carMode == 'N') {
            System.out.println("Car wash station is Available");
        }
        else if (carMode == 'R') {
            System.out.println("Reverse is available" + "Back camera activated");
        }
            else {
                System.out.println("Invalid mode");
            }


//        3. Store a number in an int variable.
//        if the number is divisible by 15
//        Display "Divisible by 15"
//        Otherwise
//        Display the remainder you get when divide number by 15


        int number = 31;



        if(number % 15 == 0){
            System.out.println("Divisible by 15");
        }else{
            System.out.println(number % 15 );
        }


//        4. Store your name in a variable.
//        if your name length comes out greater than 8
//        Display your name after replacing all 'a' to 'A' from your name.
//                Otherwise
//        Display your name in uppercase.


        String myName = "Ruslan";

        if(myName.length() > 8){
            System.out.println(myName.replace('a' ,'A' ));
        }else{
            System.out.println(myName.toUpperCase());
        }


//        5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
//        If you average of stored numbers greater than 25
//        Display Array from index 0 to last
//        Otherwise
//        Display Array from index last to 0

// had some problems with finding an average , tryed to search it online but still cant understand fully
        // i will just check it on the lesson hot its done , so i know it









//        6. Create a supermarket item finder
//        Take input from user and based on the input, you should display user which aisle has the item
//        For example: user enter milk, you program should say aisle 8. If the item is not found,
//        display a message saying "Out of stock "Please create program for below requirement
//        Milk = Aisle Eight
//                Eggs = Aisle Eight
//        French Fries = Aisle seven
//                Candy = Aisle Three
//        Frozen Pizza = Aisle seven
//                Donuts = Aisle Eight
//                Diapers = Aisle One
//                Apple = Aisle two
//                Orange = Aisle two

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type an item");
        String scanned = sc.nextLine();


            String prodName = "Candy";

            switch (prodName){
                case "Diapers":
                    System.out.println("Is located in Aisle One");
                    break;
                case "Apple":
                case "Orange":
                    System.out.println("Is located in Aisle Two");
                    break;
                case "Candy":
                    System.out.println("Is located in Aisle Three");
                    break;
                case "Frozen Fries":
                case "Frozen Pizza":
                    System.out.println("Is located in Aisle Seven");
                    break;
                case "Eggs":
                case "Donuts":
                    System.out.println("Is located in Aisle Eight");

            }





    }
}
