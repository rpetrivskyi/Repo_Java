package Lessons;

public class Train_ {


    public static void main(String[] args) {
        String month = "Summer";

        switch (month){


        case "Jan":
        case "Feb":
        case "Dec":
            System.out.println("Winter");
            break;
        case "March":
        case "April":
        case "May":
            System.out.println("Spring");
            break;
        case "Jun":
        case "Jul":
        case "Aug":
            System.out.println("Summer");
            break;
        case "Sept":
        case "Oct":
        case "Nov":
            System.out.println("Autumn");
            break;
        default:
            System.out.println("Doesnt match");
    }

    }
}
