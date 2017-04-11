import java.util.Random;

public class Rng {
  
  public static int getSimpleRandomNumber(int maxNum) {
    Random rand = new Random();
    int randomI = rand.nextInt(maxNum);
    return randomI;
  }
  
  public static double getComplexRandomNumber() {
    double randomD = Math.random();
    double multiplier = Math.random();
    multiplier *= 10;
    randomD = randomD + multiplier;
    if (randomD > 10) {
      randomD = 10;
    }
    return randomD;
  }
  
  public static void testNumber(double guess, double randomD) { //<-- This is a parameter
    // random = 7.94454; //just a random number for testing purposes
    System.out.printf("You entered the number: %.1f %n", guess);
    System.out.printf("We randomly generated the number: %.1f %n", randomD);
    if ((randomD - guess < 0.05) && (guess - randomD < 0.05)) {
      System.out.println("Wow, aren't you lucky!");
    } else {
      System.out.println("Better luck next time.");
    }
  }
  
}
