package Lessons;

public class String_Lesson {


    public static void main(String[] args) {


        String myStatement = "I am a good Programmer";

        String extractedString = myStatement.substring(12, 22);
        System.out.println("Extracted word: " + extractedString);

        String[] words = myStatement.split(" ");
        System.out.println("Number of words: " + words.length);

        String name = "Ruslan";
        int count = name.lastIndexOf("");
        System.out.println("name by LastIndex: " + count);
        int charcount = name.toCharArray().length;
        System.out.println("Calculated with char Array " + charcount);


        String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
        boolean isJohnPresent = names[1].equals("JOHn");
        System.out.println(isJohnPresent);

        String[] friends = {"John", "Johny", "Bob", "Mike", "Ihor",};
        int lenghOfArray = friends.length;
        System.out.println(lenghOfArray);

        //System.out.println("Name of each friend: " + friends[lenghOfArray - 1];

        boolean isSeconPosStartsA = friends[2].startsWith("A");
        System.out.println(isSeconPosStartsA);
    }
}
