package Lessons;

public class String_Lesson {


    public static void main(String[] args) {
// ignore the "" to show it in my message
        String messge = "This is \"my\" message";
        System.out.println(messge);

        // here we use loop to break the sentance on many variables where the space is
        // when we wont to pull out some info from a text
        // we put all the data in string and then break
        String [] words = messge.split(" ");
        for (String word : words){
            System.out.println(word);
        }




        String myStatement = "I am a good Programmer";
        System.out.println(myStatement.length());
        System.out.println(myStatement.toLowerCase());
        System.out.println(myStatement.contains("I"));
        System.out.println(myStatement.charAt(0));
        System.out.println(myStatement.equals("technosoft"));
        System.out.println(myStatement.isEmpty());
        System.out.println(myStatement.startsWith("hi"));
        System.out.println(myStatement.endsWith("by"));



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
