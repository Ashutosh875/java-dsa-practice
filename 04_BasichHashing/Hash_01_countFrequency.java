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
  public static void main(String[] args) {
    
    int[] arr = {1,3,3,2,3,1,2,2,3,12};
    System.out.println(countIntFreq(3, 12, arr));

    System.out.println(countCharFreq('z', "azbbaacdz"));

  }
}
