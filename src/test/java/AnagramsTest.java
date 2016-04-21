import org.junit.*;
import static org.junit.Assert.*;

public class AnagramsTest {

  @Test
  public void TopAndPot_anAnagram_Test() {
    Anagrams newAnagram = new Anagrams();
    assertEquals(true, newAnagram.answer("top", "pot"));
  }

  @Test
  public void TopAndNot_anAnagram_Test() {
    Anagrams newAnagram = new Anagrams();
    assertEquals(false, newAnagram.answer("top", "not"));
  }
}
