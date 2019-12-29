package Lessons;

public class TempCalc {
    public static void main(String[] args) {

        double fahrenHeit = 70; //0c

        double celsius = (fahrenHeit - 32) * 5/9;
        System.out.println(celsius);


        double kelvin = (fahrenHeit + 459.67) * 5 / 9;
        System.out.println(kelvin);


    }

}
