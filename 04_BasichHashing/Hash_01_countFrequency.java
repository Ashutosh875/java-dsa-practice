import java.util.HashMap;

public class Hash_01_countFrequency {

  // counting frequency of an integer in an array
  public static int countIntFreq(int n,int atMax,int[] arr){

    int size = arr.length;
    int[] hash = new int[atMax+1];
    
    for(int i=0; i<size; i++){
      hash[arr[i]] += 1;
    }

    return hash[n];
  }

  //counting frequency of characters in a string
  public static int countCharFreq(char ch, String text){

    text = text.toLowerCase();
    int size = text.length();
    int[] hash = new int[26]; 
    // for more characters that are no specified, then hsash-array size will be 256
    
    for(int i=0; i<size; i++){
      hash[text.charAt(i)-'a'] += 1;
    }

    return hash[ch - 'a'];
  }

  //counting frequency using Map
  public static int countFreqUsingMap(int n , int[] arr){
    HashMap<Integer,Integer> hash = new HashMap<>();
    for(int i=0 ; i<arr.length ; i++){
      hash.put(arr[i], (hash.getOrDefault(arr[i], 0)+1));
    }
    return hash.get(n);
  }

  public static void main(String[] args) {
    
    int[] arr = {1,3,3,2,3,1,2,2,3,12};
    System.out.println(countIntFreq(3, 12, arr));

    System.out.println(countCharFreq('z', "azbbaacdz"));

    System.out.println(countFreqUsingMap(3, arr));

    /* 
    * Using array for counting frequency has a cap
    * and it generated the array of size for max value of element present in size , resulting in inefficient 
    * use of memory 
    * so with hashmap no duplicate values are allowed and ot will take only those element which
    * are present in array
    */

  }
}
