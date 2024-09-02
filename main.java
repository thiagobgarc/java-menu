import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String[] coffee = {"Macchiato", "Latte", "Cappuccino", "Regular", "Black"}; // Array of coffee menu
    double[] price = {3.99, 3.64, 3.24, 2.46, 1.99}; // Array of numbers for prices
    // int[] id = {1, 2, 3, 4, 5}; // ID of coffee to be used later

    String answer = ""; // Must include "" or error will pop up saying String answer needs to be initialized

    System.out.println("Welcome to the coffee shop!");
    System.out.println("Here we have all sorts of coffee: ");
    //To print the menu better using for loop
    for (String coffees: coffee) {
      System.out.print(coffees+ " ");
    }
    System.out.println("\n Which coffee would you like to have?: ");

    // try-catch for error handling if user inputs wrong answer
    try { 
      answer = scanner.nextLine(); // Took String variable answer to user input after previous println in line 12
    } catch (java.util.InputMismatchException e) { // catch error at input by imported package mentioned earlier line 1
      //TODO: handle exception
      System.out.println("Invalid input try again.");
      scanner.close();
    }

    // switch statement
    switch (answer.toLowerCase()) { // .toLowerCase() method used to allow user input to include capitals and lowercase answers
    // Retrieves price[] at array in double price mentioned in line 9
      case "macchiato":
        System.out.println("Price: " + price[0]);    
        break;
      case "latte":
        System.out.println("Price: " + price[1]);
        break;
      case "cappuccino":
        System.out.println("Price: " + price[2]);
        break;
      case "regular":
        System.out.println("Price: " + price[3]);
        break;
      case "black": 
        System.out.println("Price: " + price[4]);
        break;
      default:
        break;
    } 

    scanner.close();
  }
}
