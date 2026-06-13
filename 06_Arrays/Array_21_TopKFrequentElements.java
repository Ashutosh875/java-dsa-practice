import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Array_21_TopKFrequentElements {

  // O(n + mlogk)
  public static int[] topKFrequentElements(int[] nums, int k) {

    if (k == 0 || nums.length == 0)
      return new int[0];

    int[] result = new int[k];

    Map<Integer, Integer> freqMap = new HashMap<>();

    // O(n)
    for (int i : nums) {
      freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
    }

    Queue<Integer> pq = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

    // O(m logk)
    for (int key : freqMap.keySet()) {
      pq.offer(key);
      if (pq.size() > k) {
        pq.poll();
      }
    }

    while (k-- > 0) {
      result[k] = pq.poll();
    }

    return result;
  }

  public static int[] opt(int[] nums, int k) {
    if (k == 0 || nums.length == 0)
      return new int[0];

    int[] result = new int[k];

    Map<Integer, Integer> freqMap = new HashMap<>();

    for (int i : nums) {
      freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
    }

    List<Integer>[] buckets = new List[nums.length + 1];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new ArrayList<>();
    }

    for (int key : freqMap.keySet()) {
      buckets[freqMap.get(key)].add(key);
    }

    List<Integer> temp = new ArrayList<>();

    for (int i = buckets.length - 1; i >= 0; i--) {
      List<Integer> list = buckets[i];
      for (int j : list) {
        temp.add(j);
      }
    }

    while (k-- > 0) {
      result[k] = temp.get(k);
    }

    return result;
  }

  public static void main(String[] args) {

    int[] nums = {1,1,1,1,2,2,2,3,3,3,4,4};
    
    topKFrequentElements(nums, 3);
    opt(nums, 3);
  }
}
