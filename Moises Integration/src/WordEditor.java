
public class WordEditor {
  
  
  static StringBuilder Word = new StringBuilder("word");
  
  public static void letterRemove(int index) {
    Word.deleteCharAt(index);
  }
  
  public static void reverseWord() {
    Word.reverse();
  }
  
  public static void letterAdd(int index, char letter) {
    Word.insert(index, letter);
  }
  
  
  public static String showWord() {
    String FinalWord = Word.toString();
    return FinalWord;
  }
  
}
