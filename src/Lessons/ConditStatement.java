package Lessons;

public class ConditStatement {

    public static void main(String[] args) {


        // if hour is between 06:00 and 11:59; Greet "Good Morning";
        // if hour is between 12:00 and 17:59; Greet "Good Evening";
        //  "Goodnight"

 //       int hour = 1900;

        if (hour >= 0600 && hour < 1200) {
            System.out.println("Good morning");
        }else if (hour >=1200 && hour < 1800){
            System.out.println("Good evening");
        }else {
            System.out.println("Good night");
        }


 //       boolean isAccountIsLocked = false;
 //       String userRole = "user";

//        if (isAccountIsLocked == true){
//            System.out.println("Account blocked");
//        } else if(userRole.equals("Admin")){
//            System.out.println("Welcome Admin");
//        }else{
//            System.out.println("Welcome to Account");
//        }


        //1. If customer has $1000 or more on the checking account and iPhone X is
        //Available on the inventory then display alert saying "You can goto store and purchase the iPhone"
        //2. If customer has credit score greater than 600 or customer has $1000
        // or more on checking account then display alert saying "You are eligible to purchase the phone",
        //3. if none of the above condition is not true then display alert saying "Your not eligible for iPhone"
        int customerCheckingBalance = 1000;
        int iPhoneInventory = 10;
        int customerCreditScore = 700;
        if (customerCheckingBalance >=1000 && iPhoneInventory > 0) {
            System.out.println("You can purchase iPhone");
        } else if (customerCreditScore > 600 || customerCheckingBalance >= 1000) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Your not eligible for iPhone");
        }





//                if (condition) {
            //statement
 //        }else if (anotherCondition) {
             //statement
 //        } else {
             //Default task
  //       }



        }
}
