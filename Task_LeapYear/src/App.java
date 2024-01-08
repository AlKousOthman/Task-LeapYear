import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year ");
        int yearEntered = scn.nextInt();

        if (yearEntered % 400 == 0) {
            System.out.println(yearEntered + " is a leap year");
          } 
          else if (yearEntered % 100 == 0) {
            System.out.println(yearEntered + " is not a leap year");
          } 
          else if (yearEntered % 4 == 0) {
            System.out.println(yearEntered + " is a leap year");
          } 
          else {
            System.out.println(yearEntered + " is not a leap year");
          }
        
          scn.close();

    }
}