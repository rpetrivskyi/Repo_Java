package Lessons;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Switch_Stmt {


    public static void main(String[] args) {

        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Excelent");
                    break;
                case 'B':
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You Passed");
            case 'F':
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Invalid Grade");
        }






        String month = "Aug";

        switch (month) {
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
