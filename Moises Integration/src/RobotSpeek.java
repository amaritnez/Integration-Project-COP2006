import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class RobotSpeek {
  
  static Queue<String> RobotSentence = new LinkedList<String>();
  
  static String[] RobotWords = {
      "Beep", "Boop", "Bop", "Bep",
      "Be", "Boo", "Ba"
  };
  
  public static void createSentence(int wordChoice) throws Exception {
    
    switch (wordChoice) {
      
      case 0:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 1:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 2:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 3:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 4:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 5:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 6:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case 7:
        RobotSentence.add(RobotWords[wordChoice]);
        break;
        
      case -1:
        break;
        
      default:
        throw new Exception();
    }
    
  }
  
  public static void addError() {
    RobotSentence.add("ERROR");
  }
  
  
  public static String printWord() throws NoSuchElementException {
    return RobotSentence.remove();
  }

}
