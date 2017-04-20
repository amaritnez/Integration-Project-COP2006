
public class ArrayTableTwo extends ArrayTable{
  
  static int[][] multiTableValues = new int[5][5];
  
  public static void createTableValues() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        multiTableValues[i][j] = Rng.getSimpleRandomNumber(100);
      }
    }
  }
  
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
        }
        else {
          System.out.print(multiTableValues[l][m] + "        ");
        }
      }
    }
    System.out.println();
  }
  
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
      //countY++;
      System.out.println("The first occurence of " + tableValueChoice + " is under " + tableHeader[countX]
          + " and is in the " + countY + " row.");
    }
    else {
      System.out.println("The number " + tableValueChoice + " is not in the table.");
    }
  }

}
