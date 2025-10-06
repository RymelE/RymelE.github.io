// Write your imports here if needed
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args){
        int monthnum;
        int year;
        String month = "";
        int days = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month in the year");
        monthnum = input.nextInt();
        System.out.println("Enter a year:");
        year = input.nextInt();
        
        switch (monthnum) {
            case 1-> days = 31;
            case 2-> days = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? 29 : 28;
            case 3-> days = 31;
            case 4-> days = 30;
            case 5-> days = 31;
            case 6-> days = 30;
            case 7-> days = 31;
            case 8-> days = 31;
            case 9-> days = 30;
            case 10-> days = 31;
            case 11-> days = 30;
            case 12-> days = 31;
        }

        switch (monthnum) {
            case 1-> month = "January";
            case 2-> month = "February";
            case 3-> month = "March";
            case 4-> month = "April";
            case 5-> month = "May";
            case 6-> month = "June";
            case 7-> month = "July";
            case 8-> month = "August";
            case 9-> month = "September";
            case 10-> month = "October";
            case 11-> month = "November";
            case 12-> month = "December";
        }
        
        System.out.println(month + " " + year + " has " + days + " days");
    }
  
}