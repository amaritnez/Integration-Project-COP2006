
public class CasualD extends Hangman {
  
  private String CasualWord;
  
  String[] CasualWords = {
      "hello", "test", "box", "truck",
      "challenge", "racecar"
  };

  public CasualD(int difficulty) {
    super(difficulty);
    for (int j = 0; j < CasualWords.length; j++){
      Words.add(j, CasualWords[j]);
    }
    this.CasualWord = CasualWords[Rng.getSimpleRandomNumber(CasualWords.length)];
    for (int i = 0; i < CasualWord.length(); i++) {
      GuessLine.insert(i, "-");
    }
  }
  
  /*public String getAnswer() {
    return CasualWord;
  }
  */
  public StringBuilder getGuessLine() {
    return GuessLine;
  }
  
  public String getWord() {
    return Words.get(Words.indexOf(CasualWord));
  }
  
  
  

}
