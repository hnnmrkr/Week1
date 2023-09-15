import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    // Exercise number 5 - Create a program that counts how many seconds there are in a year.
    int days = 365;
    int secondsInHour = 60 * 60;
    int secondsInDay = secondsInHour * 24;
    int secondsInYear = secondsInDay * days;

    System.out.println("There are " + secondsInYear + " seconds in a year.");

    /* // Reading user input
    Scanner reader = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = reader.nextLine(); // User writes a name in console

    System.out.println("Hi, " + name); */

    // Exercise nr 9 - Create a program that asks the user for two integers and prints their quotient.
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a number: ");
    int numberX = Integer.parseInt(reader.nextLine());

    System.out.println("Type another number: ");
    int numberY = Integer.parseInt(reader.nextLine());

    double calculation = 1.0 * numberX / numberY;

    System.out.println(calculation);

    // Exercise 11 - Bigger number
    System.out.println("-- Exercise 11 --");
    System.out.println("Type a number: ");
    int a = Integer.parseInt(reader.nextLine());

    System.out.println("Type another number: ");
    int b = Integer.parseInt(reader.nextLine());

    System.out.println(Math.max(a, b) + " is bigger than " + Math.min(a, b));

    // Exercise 14 - A Positive Number
    System.out.println("Type a number: ");
    int c = Integer.parseInt(reader.nextLine());

    if (c > 0) {
      System.out.println("The number is positive ");
    } else {
      System.out.println("The number is not positive");
    }

    // Exercise 22 - Password
    String password = "carrot";

    while (true) {
      System.out.print("Type the password: ");
      String command = reader.nextLine();
      if (command.equals(password)) {
        System.out.println("Correct!");
        System.out.println("The secret is : qwerty!");
        break;
      } else {
        System.out.println("Wrong!");
      }
    }

  }
}