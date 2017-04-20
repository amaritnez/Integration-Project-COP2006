import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
  
  private String Answer;
  private int difficulty;
  
  StringBuilder GuessLine = new StringBuilder();
  ArrayList<String> Words = new ArrayList<String>();
  
  private int tries;
  
  Hangman Object = new Hangman(1);
  
  public Hangman(int difficulty) {
    this.difficulty = difficulty;
  }
  
  public String getAnswer(int answerDifficulty) {
    switch (answerDifficulty) {
      
      case 1:
        return ((CasualD) Object).getWord();
      
      case 2:
        return "Hi";
    }
    return "fail";
  }
  
  
  
  
  
  
  
  

}
