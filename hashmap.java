import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

  public char firstRepeatingCharacter(String str) {

    Set<Character> set = new HashSet<>();
    for (var ch : str.toCharArray()) {
      if (set.contains(ch))
        return ch;
      set.add(ch);
    }

    return Character.MIN_VALUE;
  }

}
