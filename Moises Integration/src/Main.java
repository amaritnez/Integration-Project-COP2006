//"name and description at the top of  all code" -Professor Vanselow 2017
//so.....name: Moises Martinez
//description: Integration Project
//- A random mix-match of code following techniques that I've learned
//in class to demonstrate my (lack of) skills /s
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args Command line arguement
	 */
	public static void main(String[] args) {

	  System.out.println("Hello, person! Type a number next to a program to activate that program.");
	  System.out.println("We currently have the following programs:");
    System.out.println("1. Hello World Program");
	  System.out.println("2. Random Number Guessing Game");
	  System.out.println("3. Integer Division");
	  System.out.println("4. Variable Definitions");
	  System.out.println("5. Pythagorean Theorem");
	  System.out.println("6. Simple Table Generator");
	  System.out.println("7. Robot Speaker");
	  
	  Scanner input = new Scanner(System.in);
	  
	  int choice = 0;
	  boolean goodChoice = true;
	  
    do {

      try {

        choice = Integer.parseInt(input.next());

      } catch (NumberFormatException e) {
        
        choice = -2;
      
      } catch (Exception e) {
        choice = -2;
      }

      goodChoice = true;

      switch (choice) {

        case 1:
          Hello.printOut(); // <-- This is a call
          break;

        case 2:
          System.out.println("Test your luck! Enter a number between 0 and 10, with one decimal point.");
          double random = Rng.getComplexRandomNumber();
          double guess = 0;

          try {
            guess = input.nextDouble();
            if (guess > 10 || guess < 0) {
              throw new Exception();
            }
          } catch (Exception e) {
            System.out.println("You didn't enter a proper number. Defaulting to 7.7");
            guess = 7.7;
          } finally {
            Rng.testNumber(guess, random); // <-- This is an argument
          }
          break;

        case 3:
          IntDivision Numerator = new IntDivision(4, "I said enter 4!!!", "Try again. Please listen this time.");
          int numerator = Numerator.getNumberTest(input);

          IntDivision Denominator = new IntDivision(3, "I said enter 3!!!", "Try again. Please listen this time.");
          int denominator = Denominator.getNumberTest(input);

          System.out.format("Why you wasted your time entering numbers:\n");
          double fraction = numerator / denominator;
          System.out.println("" + numerator + " divided by " + denominator + " is " + fraction);
          System.out.println("Wait, that doesn't seem right.");

          Numerator.setStatementOne("Ugh, not this again.");
          Numerator.setStatementTwo("Just do what I say!");
          numerator = Numerator.getNumberTest(input);

          Denominator.setStatementOne("Why do you not listen!.");
          Denominator.setStatementTwo("Do what I'm telling you to do!");
          denominator = Denominator.getNumberTest(input);

          System.out.println("Ok. " + numerator + " divided by " + denominator + " is " + fraction);
          System.out.println("Wait, really? WHY ISN'T THIS WORKING!");
          System.out.println("Oh. wait, I know why. Ok, it's going to work this time.");

          Numerator.setStatementOne("Just stop, please. It's not funny anymore.");
          Numerator.setStatementTwo("You know what to do.");
          numerator = Numerator.getNumberTest(input);

          Denominator.setStatementOne("I know you're not entering 3.");
          Denominator.setStatementTwo("Just do it, please...");
          denominator = Denominator.getNumberTest(input);

          fraction = (double) numerator / denominator;
          System.out.println("" + numerator + " divided by " + denominator + " is " + fraction);
          System.out.println("YES! IT WORKED!");
          System.out.println("Turns out dividing the two ints just kept giving us 1. Dumb computer...");
          System.out.println("...oh wait, that's me.");
          break;

        case 4:
          System.out.println("What is a Variable?");
          VariableDefinition.testDefinition(input);
          System.out.println("There are 8 primitive data types (variables):");
          System.out.println("1. byte");
          System.out.println("2. short");
          System.out.println("3. int");
          System.out.println("4. long");
          System.out.println("5. double");
          System.out.println("6. float");
          System.out.println("7. boolean");
          System.out.println("8. char");
          System.out.println(
              "9. There's also Strings. Strings aren't a primitive data type, but they" + " act very similar to one.");
          VariableDefinition.explanation(input);
          break;

        case 5:
          Triangle userTriangle = new Triangle();

          System.out.println("Enter the length of a side of a right triangle (can't be the hypotenuse).");
          userTriangle.setSideOne(input);

          System.out.println("Enter the length of the other side (still can't be the hypotenuse).");
          userTriangle.setSideTwo(input);

          userTriangle.setHypotenuse(userTriangle.getSideOne(), userTriangle.getSideTwo());

          if (userTriangle.getHypotenuse() - Math.floor(userTriangle.getHypotenuse()) != 0) {
            System.out.printf("The hypotenuse of the triangle is about %.2f", userTriangle.getHypotenuse());
          } else {
            System.out.println("The hypotenuse of the triangle is " + userTriangle.getHypotenuse());
          }
          break;

        case 6:
          ArrayTable.createTableValues();
          ArrayTable.showTable();
          System.out.println("The sum of the table values is " + ArrayTable.sumTable());
          System.out.println("The smallest value of the table is " + ArrayTable.getSmallestValue());
          ArrayTable.findSpecificValue();
          break;
          
        case 7:
          System.out.println("Talk like a robot! Enter a number to add that word "
              + "to your sentence. When done, type \"-1 \".");
          System.out.println("0. Beep");
          System.out.println("1. Boop");
          System.out.println("2. Bop");
          System.out.println("3. Bep");
          System.out.println("4. Be");
          System.out.println("5. Boo");
          System.out.println("6. Ba");
          System.out.println("Enter something else and watch your robot panic!");
          int robotWord = 10;
          do {
            try {
              robotWord = Integer.parseInt(input.next());
              RobotSpeek.createSentence(robotWord);
            } catch (Exception e) {
              RobotSpeek.addError();
              robotWord = 7;
            }
          } while (robotWord != -1);
          boolean empty = false;
          while (empty == false) {
            try {
              System.out.print(RobotSpeek.printWord() + " ");
            } catch (NoSuchElementException e) {
              empty = true;
            }
          }
          break;
          

        default:
          System.out.println("Whoa, why is this being shown? You must of entered something wrong. Try again.");
          goodChoice = false;
          break;

      }
    } while (goodChoice == false);

	}
	
}

//Because I'm too lazy to think of a program to explain these (yay spring break!):
//-A conditional operator performs conditional actions (AND, OR) on boolean expressions
//-A relational operator relates two things to one another (greater than, less than, equal to, etc.)
//If you've made it this far into the program (i.e. the end) and you still need a demonstration of
//these operators, we've got a problem.