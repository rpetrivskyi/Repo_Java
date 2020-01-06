package String_HW;

import java.util.Scanner;

public class TempClacul {
    public static void main(String[] args) {

        //        Celsius to Kelvin
        //T(K) = T(°C) + 273.15

        double celsius = 30;
        double kelvin = celsius + 273.15;

        System.out.println(kelvin);

        //        Celsius to Fahrenheit
        //  T(°F) = T(°C) × 9/5 + 32

        double celsius = - 15;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit);

        //  Kelvin to Celsius
        //  T(°C) = T(K) - 273.15

        double kelvin = 254.12;
        double celsius = kelvin - 273.15;

        System.out.println(celsius);


        //        Kelvin to Fahrenheit
        //  T(°F) = T(K) × 9/5 - 459.67

        double kelvin = 345;
        double fahrenheit = (kelvin * 9 / 5) - 459.67;
        System.out.println(fahrenheit);





    }
}
