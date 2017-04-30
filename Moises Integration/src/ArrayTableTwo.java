
/**Creates a table using a 2d array, then performs some various actions
 * with it.
 * @author Moises
 *
 */
public class ArrayTableTwo extends ArrayTable {
  
  static int[][] multiTableValues = new int[5][5];
  
  /**Uses a random number generator to create
   * values for the 2d array.
   */
  public static void createTableValues() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        multiTableValues[i][j] = Rng.getSimpleRandomNumber(100);
      }
    }
  }
  
  /**Shows the 2d array in its entirety (values included).
   * 
   */
  public static void showTable() {
    for (int k = 0; k < 5; k++) {
      System.out.print(tableHeader[k] + ":  ");
    }
    System.out.println();
    
    for (int l = 0; l < 5; l++) {
      System.out.println();
      for (int m = 0; m < 5; m++) {
        if (multiTableValues[l][m] < 10) {
          System.out.print(multiTableValues[l][m] + "         ");
        } else {
          System.out.print(multiTableValues[l][m] + "        ");
        }
      }
    }
    System.out.println();
  }
  
  /**Uses a random number generator to provide a number to search for.
   * Will reveal the first location of the number in the array, or display
   * that the number isn't present otherwise.
   */
  public static void findSpecificValue() {
    int tableValueChoice = Rng.getSimpleRandomNumber(100);
    //tableValueChoice = multiTableValues[3][0];
    boolean match;
    int countM = 0;
    int countX = 0;
    int countY = 0;
    do {
      if (countY >= 5) {
        countY = 0;
        countX++;
      }
      match = (tableValueChoice == multiTableValues[countY][countX]);
      countY++;
      countM++;
    } while (match == false && countM < 25);
    if (match == true) {
      // countY++;
      System.out.println("The first occurence of " + tableValueChoice + " is under " 
          + tableHeader[countX] + " and is in the " + countY + " row.");
    } else {
      System.out.println("The number " + tableValueChoice + " is not in the table.");
    }
  }

}
