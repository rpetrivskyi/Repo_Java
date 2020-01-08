package Lessons;

public class EnhanceledLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50 };

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element: " + numbers[i]);
        }

        for (int number : numbers){
            System.out.println(number);
        }


        for (int i : numbers){
            System.out.println(i);
        }


        String[] names = {"mo", "Larry", "james", "Lacy"};

        for (String name : names) {
            System.out.println(name);
            boolean isJames = name.equalsIgnoreCase("james");
            if (isJames == true) {
                System.out.println("James is here");
                break;
            }
        }


        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for(String month : months){
            System.out.println(month);
            boolean isMarch = month.equalsIgnoreCase("march");
            if(isMarch == true){
                System.out.println("March is present: ");
                break;

            }
        }

    }
}
