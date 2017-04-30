import java.util.InputMismatchException;
import java.util.Scanner;

/**Short program which defines and explains some of Java's primative data types.
 * @author Moises
 */
public class VariableDefinition {

  static String[] definitions = { "A  variable  is a  location  in  memory", 
      "a variable  is a  location  in  memory", "location  in  memory", 
      "Location  in  memory", "a location  in  memory", "A  location  in  memory" };

  /**Ask the user to define a variable. Then tells the user the definition, if
   * wrong.
   * @param input Takes user input
   */
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
      System.out.println("You're  right!");
    } else {
      System.out.println("Mmm,  not  quite.");
      System.out.println("A  variable  is a  location  in  memory.");
    }
  }

  /**Provides definitions for various data types, at the user's request.
   * @param input Takes user input
   */
  public static void explanation(Scanner input) {
    int dataChoice = 1;
    while (dataChoice != 0) {
      System.out.println("Enter  a  number  next  to  a  variable  to  learn  more  about  it. "
          + "Enter something  else  to  leave.");
      try {
        dataChoice = input.nextInt();
      } catch (InputMismatchException e) {
        input.next();
        dataChoice = 0;
      } catch (Exception e) {
        dataChoice = 0;
      }
      // dataChoice = input.nextInt();
      switch (dataChoice) {

        case 1:
          System.out.println("byte  stores  integers  of  tiny  values  (-128-127  inclusive).");
          break;

        case 2:
          System.out.println("short  stores  small-sized integers  (-32,768-32,767  inclusive).");
          break;

        case 3:
          System.out.println("int  stores  normal-sized integers (-2^31  - (2^31)-1  inclusive)."
              + " This  is generally  the  default  value  used for  integers.");
          break;

        case 4:
          System.out.println("long  stores  integers  of  large  length  (too  large  to  type)."
              + " Useful  if you're  working  with  really  large  numbers;  overkill  otherwise.");
          break;

        case 5:
          System.out.println("double  stores  decimals.  This  is generally  the  default" 
              + " choice  for  decimals.");
          break;

        case 6:
          System.out.println("float  stores  decimals  of  smaller  lengths.  Not  really"
              + " important  unless  you  trying  to  be  efficient  with  memory.");
          break;

        case 7:
          System.out.println("boolean  stores  the  values  true  or  false.  Useful  when  "
              + "evaluating whether  something  is true  or  not.");
          break;

        case 8:
          System.out.println("char  stores  characters,  i.e.  single  letters  or  symbols.");
          break;

        case 9:
          System.out.println("Strings  are often  used to  store  words.  More  technically,  "
              + "Strings store  strings  of  characters  (hence  the  name).");
          break;

        default:
          System.out.println("Exiting  Definitions");
          dataChoice = 0;
          break;
      }
    }
  }
}
