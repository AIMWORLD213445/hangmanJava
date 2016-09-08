import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game {
  private String[] mAnswers = {"boat", "house", "Brian", "Yusuf"};
  private Integer mAnswerIndex = -1;
  private List<Character> mPastGuesses = new ArrayList<Character>();
  public Integer getAnswerIndex(){
    Random randomNumber = new Random();
    mAnswerIndex = randomNumber.nextInt(4);
    return mAnswerIndex;
  }
  public List<Character> addGuess(Character guess){
    mPastGuesses.add(guess);
    return mPastGuesses;
  }
}
