import java.util.Scanner;

public class VariableDefinition {
  
  static String[] definitions = {
    "A variable is a location in memory", "a variable is a location in memory", "location in memory",
    "Location in memory", "a location in memory", "A location in memory"
  };
  
  public static void testDefinition(Scanner input) {
    input.nextLine();
    String userDefinition = input.nextLine();
    int defCount = 0;
    int length = definitions.length;
    boolean defCorrect;
    do {
        defCorrect = userDefinition.equals(definitions[defCount]);
        defCount++;
    } while (defCorrect == false && defCount < length);
    if (defCorrect == true) {
      System.out.println("You're right!");
    }
    else {
      System.out.println("Mmm, not quite.");
      System.out.println("A variable is a location in memory.");
    }
  }
  
  public static void explanation(Scanner input) {
    int dataChoice = 1;
    while (dataChoice != 0) {
      System.out.println("Enter a number next to a variable to learn more about it. Type 0 to leave.");
      dataChoice = input.nextInt();
      switch (dataChoice) {
        
        case 1:
          System.out.println("byte stores integers of very small values (-128-127 inclusive).");
          break;
          
        case 2:
          System.out.println("short stores integers of fairly small values (-32,768-32,767 inclusive).");
          break;
          
        case 3:
          System.out.println("int stores integers of average length (-2^31 - (2^31)-1 inclusive)."
              + " This is generally the default value used for integers.");
          break;
          
        case 4:
          System.out.println("long stores integers of very long length (too large to type)."
              + " Useful if you're working with really large numbers; overkill otherwise.");
          break;
          
        case 5:
          System.out.println("double stores decimals. This is generally the default"
              + " choice for decimals.");
          break;
          
        case 6:
          System.out.println("float stores decimals of smaller lengths. Not really"
              + " important unless you trying to be efficient with memory.");
          break;
          
        case 7:
          System.out.println("boolean stores the values true or false. Useful when evaluating"
              + " whether something is true or not.");
          break;
          
        case 8:
          System.out.println("char stores character values. As in, storing single letters or symbols.");
          break;
          
        case 9:
          System.out.println("Strings are often used to store words. More technically, Strings"
              + " store strings of characters (hence the name).");
          
        case 0:
          break;
          
        default:
          System.out.println("You entered something that isn't here. So....no definition for you!");
          break;
      }
    }
  }

}
