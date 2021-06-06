import java.util.Scanner;
import java.util.Calendar;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); //input
        System.out.print("What is your current age? ");
        int currentage= sc.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retirementage= sc.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int timeleft = retirementage-currentage;
        //time left
        System.out.println("You have " + (timeleft) + " years left until you can retire.");
        //retirement year
        System.out.println("It's "+ year + ", so you can retire in " + (2021+(timeleft)));
    }
}
