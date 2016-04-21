import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// import java.util.LinkedHashMap;

public class Anagrams {
  public static Boolean answer(String word1, String word2) {

    char[] word1Array = word1.toCharArray();
    char[] word2Array = word2.toCharArray();

    // ArrayList<Character> charList1 = new ArrayList<Character>(Arrays.asList(word1Array));
    // ArrayList<Character> charList2 = new ArrayList<Character>(Arrays.asList(word2Array));

    Arrays.sort(word1Array);
    Arrays.sort(word2Array);

    if (Arrays.equals(word1Array, word2Array)) {
      return true;
    } else {
      return false;
    }
  }
}
