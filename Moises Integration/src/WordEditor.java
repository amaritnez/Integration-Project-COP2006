
/**Uses a StringBuilder to manipulate a word and change it into another word.
 * @author Moises
 *
 */
public class WordEditor {
  
  static StringBuilder Word = new StringBuilder("word");
  
  /**Method that removes a char in a string at a specified position.
   * @param index value that specifies a location in the string
   */
  public static void letterRemove(int index) {
    Word.deleteCharAt(index);
  }
  
  /**
   * Reverses the order of the chars in the StringBuilder.
   */
  public static void reverseWord() {
    Word.reverse();
  }
  
  /**Adds the provided char into the specified location.
   * @param index value that specifies a location in the string
   * @param letter specific char to be used in the method
   */
  public static void letterAdd(int index, char letter) {
    Word.insert(index, letter);
  }
  
  /**Changes the StringBuilder to a String, then returns it.
   * @return Returns the modified string
   */
  public static String showWord() {
    String finalWord = Word.toString();
    return finalWord;
  }
}
