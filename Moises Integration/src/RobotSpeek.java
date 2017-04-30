import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**Uses a simple queue to create a "robot" sentence.
 * @author Moises
 */
public class RobotSpeek {

  static Queue<String> RobotSentence = new LinkedList<String>();

  static String[] RobotWords = { "Beep", "Boop", "Bop", "Bep", "Be", "Boo", "Ba" };

  /**
   * Creates various robot words based on user input.
   * 
   * @param wordChoice determines which word to select based on what the user enters
   * @throws Exception throws an exception if the user enters something that isn't a choice
   */
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

  /**
   * When an exception is caught, this method is called to add "ERROR" to the
   * robot sentence.
   */
  public static void addError() {
    RobotSentence.add("ERROR");
  }

  /**
   * Removes the various words in the queue, then throws an exception once
   * empty.
   * 
   * @return Returns the first-most word in the queue
   * @throws NoSuchElementException Throws this exception once the queue is empty
   */
  public static String printWord() throws NoSuchElementException {
    return RobotSentence.remove();
  }

}
