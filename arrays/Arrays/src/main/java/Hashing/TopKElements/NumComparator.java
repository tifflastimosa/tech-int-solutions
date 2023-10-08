package Hashing.TopKElements;

import java.util.Comparator;
import java.util.Map;

public class NumComparator implements Comparator<Map.Entry<Integer, Integer>> {

  @Override
  public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
    if (o1.getValue() == o2.getValue()) {
      return o1.getKey() - o2.getKey();
    } else {
      return o2.getValue() - o1.getValue();
    }
  }
}
