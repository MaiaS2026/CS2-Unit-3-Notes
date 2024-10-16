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
   }
}
