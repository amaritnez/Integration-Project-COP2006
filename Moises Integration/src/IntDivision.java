import java.util.Scanner;

public class IntDivision {
  
  private int condition;
  private String statementOne;
  private String statementTwo;
  
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
  
  public int getNumberTest(Scanner input) {
    System.out.println("Enter " + condition);
    int number = input.nextInt();
    while (number != condition) {
      System.out.println(statementOne);
      System.out.println(statementTwo);
      number = input.nextInt();
    }
    return number;
  }
  
}
