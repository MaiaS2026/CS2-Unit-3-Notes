public class Main {

   public static void main(String []args) {
      // One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;
      // Two == signs is checking for EQUALITY
      boolean match = (age==year); // returns a BOOLEAN
      System.out.println("Does age match year? " + match);

      year = 15; // RE-ASSIGNING
      System.out.println(age==year); // true

      //!= means "is NOT equal to"
      System.out.println(age != year); // false

      // RELATIONAL OPERATORS
      // used in boolean expressions
      double pi = 3.14159;     
      System.out.println(pi > 0); // checking if positive
      System.out.println(pi < 0); // checking if negative
      System.out.println(pi >= 3.14); // true
      System.out.println(pi<= 10); // true

      // IF STATEMENTS
      boolean isCold = false;
      if (isCold == true ) {
         System.out.println("Bring a jacket!");
      }
      System.out.println("Enjoy your walk!");

      // Magic 8Ball Mini Program
      // 1. Generate random integer between 1-8
      int number = (int) (Math.random() * 8 +1);
      System.out.println(number);

      // 2. Use that number in 8 if statements to print a different response
      if (number == 1) {
         System.out.println("Obviosuly not!");
      }

      // every "if block" is like starting a new line of questioning
      if (number == 2) {
         System.out.println("I think you need some help!");

      }
      if (number == 3) {
         System.out.println("Maaaaaaybe...");

      }
      if (number == 4) {
         System.out.println("I don't think so");

      }
      if (number == 5) {
         System.out.println("Of courseeee!");

      }
      if (number == 6) {
         System.out.println("Try asking again...");

      }
      if (number == 7) {
         System.out.println("Probably...");

      }
      if (number == 8) {
         System.out.println("My sources say yes.");
      }

      // TWO-WAY SELECTION: IF block coupled with an ELSE block
      // is like "if this is true, do something" OTHERWISE, "do something else"
      int myAge = 19;
      // BOOLEAN EXPRESSIONS here is "myAge >= 17"
      if (myAge >= 17) {
         System.out.println("You can get your license in NY!");
      }
      // else is coupled with the if statement above
      // so you do NOT need to specify a CONDITION/EXPRESSION
      else {
         System.out.println("You're too young to drive in NY");
      }

      // MULTI-WAY SELECTION
      System.out.println("What type of costume are you thinking of? (scary, cute, funny, other)");
      String choice = "scary";
      // Always start a decision with an IF statement
      if (choice.equals ("scary")) {
         System.out.println("Your should be a clown!");
      }
      // You can include as many ELSE IF statements as you want
      // but they must follow an initial IF statement
      else if (choice.equals("cute")) {
         System.out.println("You should be a bunny!");
      }
      else if (choice.equals("funny")) {
         System.out.println("You should be a an inflatable cow!");
      }
      // Provide a "catch-all" choice in case earlier conditions are not met
      else {
         System.out.println("I have no idea how to help you. Look on Pinterest?");
      }

   }
}
