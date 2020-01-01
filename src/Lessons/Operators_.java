package Lessons;

public class Operators_ {
    public static void main(String[] args) {
        //Arithmetic Operators
        int x = 10;
        int y = 5;

        int add = x + y;
        int subtract = x - y;
        int multiply = x * y;
        int divide   = x / y;

        int remainder = x % y;

        // Post Increment
        int age = 1;
        //Every birthday add 1 to age
        age++ ;
        System.out.println(age);

        //Assignment Operators

        x = x + y;
        x += y;
        //System.out.println(x);


        boolean isGreater = x > y;
        boolean isLess = y < x ;

        boolean isGreaterEqual = x >= y;
        //System.out.println(isGreaterEqual);

        //Equality

        boolean isEqual = x == y;   // note .equal only works with reference data type
        boolean isNotEqual = x != y;
        //System.out.println(isNotEqual);

        //Ternery
        //if the person older 65 he is senior, otherwise adult

        int age = 45;
        String status = age > 65 ? "senior" : "adult";
        //System.out.println(status);
        // single line if statement java

        //Logical operators
          // Returns true if both operand are true // Logical AND (&&)

        boolean isUserNameCorrect = true;
        boolean isPassswordCorrect = false;

        boolean isLoginCorrect = isUserNameCorrect && isPassswordCorrect;
        //System.out.println(isLoginCorrect);

        // Logical OR (||) Returns true if one operand is correct
        boolean isLoginCorrect = isUserNameCorrect || isPassswordCorrect;

        //System.out.println(isLoginCorrect);


        // If UYou want to flip a statement true to false , put an (!) mark
        //System.out.println(!isLoginCorrect);
        //or
        boolean flip = !isLoginCorrect;
        //System.out.println(flip);


    }
}
