import java.util.Scanner;

public class Triangle {
  
  private double sideOne;
  private double sideTwo;
  private double hypotenuse;
  
  public void setSideOne(Scanner input) {
    sideOne = input.nextInt();
  }
  
  public void setSideTwo(Scanner input) {
    sideTwo = input.nextInt();
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
