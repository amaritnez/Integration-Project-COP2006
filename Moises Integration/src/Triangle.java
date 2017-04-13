import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
  
  private double sideOne;
  private double sideTwo;
  private double hypotenuse;
  
  public void setSideOne(Scanner input) {
    try {
      sideOne = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("You did not enter a number. Defaulting to 3.");
      sideOne = 3;
      input.next();
    } catch (Exception e) {
      System.out.println("You did not enter a number. Defaulting to 3.");
      sideOne = 3;
      input.next();
    }
  }
  
  public void setSideTwo(Scanner input) {
    try {
      sideTwo = input.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("You did not enter a number. Defaulting to 3.");
      sideTwo = 4;
      input.next();
    } catch (Exception e) {
      System.out.println("You did not enter a number. Defaulting to 3.");
      sideTwo = 4;
      input.next();
    }
  }
  
  public double getSideOne() {
    return sideOne;
  }
  
  public double getSideTwo() {
    return sideTwo;
  }
  
  public void setHypotenuse(double sideOne, double sideTwo) {
    sideOne = Math.pow(sideOne, 2);
    sideTwo = Math.pow(sideTwo, 2);
    
    hypotenuse = sideOne + sideTwo;
    hypotenuse = Math.sqrt(hypotenuse);
  }
  
  public double getHypotenuse() {
    return hypotenuse;
  }

}
