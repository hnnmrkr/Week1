import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    // Exercise number 5 - Create a program that counts how many seconds there are in a year.
    int days = 365;
    int secondsInHour = 60 * 60;
    int secondsInDay = secondsInHour * 24;
    int secondsInYear = secondsInDay * days;

    System.out.println("There are " + secondsInYear + " seconds in a year.");

    // Reading user input
    Scanner reader = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = reader.nextLine(); // User writes a name in console

    System.out.println("Hi, " + name);
  }
}