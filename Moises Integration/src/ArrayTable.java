/**Creates a randomly generated array, and performs various actions using it.
 * @author Moises
 */
public class ArrayTable {

  static String[] tableHeader = { "Value  1", "Value  2", "Value  3", "Value  4", "Value  5" };

  static int[] tableValues = new int[5];

  /**
   * Uses a random number generator to create values for the array.
   */
  public static void createTableValues() {
    for (int i = 0; i < 5; i++) {
      tableValues[i] = Rng.getSimpleRandomNumber(100);
    }
  }

  /**
   * Shows the array itself (values included).
   */
  public static void showTable() {
    for (int j = 0; j < 5; j++) {
      System.out.print(tableHeader[j] + ":  ");
    }
    System.out.println();

    for (int k = 0; k < 5; k++) {
      if (tableValues[k] < 10) {
        System.out.print(tableValues[k] + "              ");
      } else {
        System.out.print(tableValues[k] + "             ");
      }
    }
    System.out.println();
  }

  /**
   * Sums up all the values in the array, then returns the sum.
   * @return Returns the sum of the array values
   */
  public static int sumTable() {
    int sum = 0;
    for (int l = 0; l < 5; l++) {
      sum += tableValues[l];
    }
    return sum;
  }

  /**
   * Runs through the array, searching for and returning the smallest value.
   * @return Returns the smallest value in the array
   */
  public static int getSmallestValue() {
    int smallest = tableValues[0];
    boolean small;
    for (int m = 0; m < 4; m++) {
      small = smallest < tableValues[m + 1];
      if (small == false) {
        smallest = tableValues[m + 1];
      }
    }
    return smallest;
  }

  /**
   * Generates a random number, then searches the array to see if the generated
   * number is in the array. Reveals the location of the number if it's in the
   * array.
   * 
   */
  public static void findSpecificValue() {
    int tableValueChoice = Rng.getSimpleRandomNumber(100);
    // tableValueChoice = tableValues[0];
    boolean match;
    int countM = 0;
    do {
      match = (tableValueChoice == tableValues[countM]);
      countM++;
    } while (match == false && countM < 5);
    if (match == true) {
      System.out.println("The  number  " + tableValueChoice + " belongs  to  " 
          + tableHeader[--countM]);
    } else {
      System.out.println("The  number  " + tableValueChoice + " is not  in  the  table.");
    }
  }
}
