import java.util.Scanner;

/**
 * Performs the pythagorean theorem based on user-input values.
 * 
 * @author Moises
 *
 */
public class Triangle {

  private double sideOne;
  private double sideTwo;

  /**
   * Sets the value of side one based on user-input. Defaults to 3 if something
   * goes wrong.
   * 
   * @param input
   *          Takes user input
   */
  public void setSideOne(Scanner input) {
    try {
      sideOne = input.nextInt();
    } catch (Exception e) {
      System.out.println("You  did  not  enter  a  number.  Defaulting  to  3.");
      sideOne = 3;
      input.next();
    }
  }

  /**
   * Sets the value of side two based on user-input. Defaults to 4 if something
   * goes wrong.
   * 
   * @param input
   *          Takes user input
   */
  public void setSideTwo(Scanner input) {
    try {
      sideTwo = input.nextInt();
    } catch (Exception e) {
      System.out.println("You  did  not  enter  a  number.  Defaulting  to  4.");
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

  /**
   * Performs the pyhtagorean theorem to give a value of the hypotenuse.
   * 
   * @return Returns the value of the hypotenuse
   */
  public double getHypotenuse() {
    return Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
  }

}
