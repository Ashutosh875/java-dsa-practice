import java.util.HashMap;
import java.util.Map;

public class Array_15_MajorityElement {

  //Tc = O(NlogN + N) and Sc = O(N)
  public static int brtMajElm(int[] nums){

    int majorityElm = 0;
    int n = nums.length;
    int maxCount = n/2;
    Map<Integer,Integer> hash = new HashMap<>();

    for(int i=0; i<n; i++){
      hash.put(nums[i] , hash.getOrDefault(nums[i] , 0)+1);
    }

    for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
      if(entry.getValue() > maxCount){
          majorityElm = entry.getKey();
      }
    }

    return majorityElm;

  }

  //Tc = O(2N) and Sc = O(1)
  public static int optMajElm(int[] nums){

    int elm = 0;
    int count = 0;

    for(int i=0; i<nums.length; i++){

        if(count == 0){
            elm = nums[i];
            count++;
        } else if (elm == nums[i]){
            count++;
        } else count--;
    }

    int ct = 0;

    for(int i=0; i<nums.length; i++){
        if(nums[i] == elm) ct++;
    }

    if(ct > nums.length/2) return elm;
    return -1;

  }
  public static void main(String[] args) {

    int[] arr = {3,3,4};
    System.out.println(brtMajElm(arr) + " : " + optMajElm(arr));
    
  }
}
