import java.util.HashMap;
import java.util.Map;

public class hashmap {

  public char firstNonRepeating(String word) {
    Map<Character, Integer> map = new HashMap<>();
    for (var c : word.toCharArray()) {
      map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
    }

    for (var ch : word.toCharArray()) {
      if (map.get(ch) == 1) {
        return ch;

      }
    }
    System.out.println(map);
    throw new RuntimeException("did not find");
  }
}
