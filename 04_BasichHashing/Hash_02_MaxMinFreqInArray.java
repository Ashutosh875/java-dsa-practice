import java.util.HashMap;
import java.util.Map.Entry;

class Hash_02_MaxMinFreqInArray {

  public static String maxMin(int[] arr){
    
    HashMap<Integer,Integer> hash = new HashMap<>();          
    for(int i : arr){
      hash.put(i, hash.getOrDefault(i, 0)+1);
    }

    int minKey= 0;
    int maxKey = 0;
    int minFrequency = Integer.MAX_VALUE;
    int maxFrequency = Integer.MIN_VALUE;

    for(Entry<Integer, Integer> entry : hash.entrySet()){
      int key = entry.getKey();
      int value = entry.getValue();

      if(maxFrequency < value){
        maxFrequency = value;
        maxKey = key;
      }

      if(minFrequency > value){
        minFrequency = value;
        minKey = key;
      }

    }
    return "Max-freq : " + maxKey + " min-freq : " + minKey;
  } 
  public static void main(String[] args) {
    
    int[] arr = {3, 1 ,8 ,1 ,1 ,9, 1 ,2 ,3 ,2};
    System.out.println(maxMin(arr));
  }
}
