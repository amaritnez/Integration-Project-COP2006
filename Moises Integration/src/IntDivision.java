import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Short program which explains the user the limitations of integer division,
 * and the usefulness of casting.
 * 
 * @author Moises
 *
 */
public class IntDivision {

  private int condition;
  private String statementOne;
  private String statementTwo;

  /**
   * .
   * 
   * @param condition
   *          The number the user must enter
   * @param statementOne
   *          A statement that the user receives after entering the wrong number
   * @param statementTwo
   *          Another statement that the user also receives for entering the
   *          wrong number
   */
  public IntDivision(int condition, String statementOne, String statementTwo) {
    this.condition = condition;
    this.statementOne = statementOne;
    this.statementTwo = statementTwo;
  }

  public void setCondition(int condition) {
    this.condition = condition;
  }

  public void setStatementOne(String statementOne) {
    this.statementOne = statementOne;
  }

  public void setStatementTwo(String statementTwo) {
    this.statementTwo = statementTwo;
  }

  /**
   * Tests the users input, and sees if the user enters the condition. If not,
   * ask the user to enter again until they enter the condition value.
   * 
   * @param input
   *          Takes user input
   * @return Returns the condition value once it's entered.
   */
  public int getNumberTest(Scanner input) {
    System.out.println("Enter  " + condition);
    int number = 0;
    try {
      number = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("That's  not  even a  number!");
      input.next();
      number = 0;
    } catch (Exception e) {
      System.out.println("That's  not  even a  number!");
      input.next();
      number = 0;
    }
    while (number != condition) {
      System.out.println(statementOne);
      System.out.println(statementTwo);
      number = getNumberTest(input);
    }
    return number;
  }

}
