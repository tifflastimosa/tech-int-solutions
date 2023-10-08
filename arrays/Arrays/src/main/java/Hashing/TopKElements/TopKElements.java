package Hashing.TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements {

  public static int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      // put the value from nums as the key, and adds or updates the value depending if the key exists or not
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new NumComparator());

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      pq.add(entry);
    }

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = pq.poll().getKey();
    }

    return result;
  }

  public static void main(String[] args) {
    topKFrequent(new int[]{3, 2, 2, 1, 1, 1}, 2);
  }

}
