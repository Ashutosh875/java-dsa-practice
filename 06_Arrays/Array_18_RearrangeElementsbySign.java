import java.util.ArrayList;
import java.util.List;

public class Array_18_RearrangeElementsbySign {

  //Tc = O(2n) and sc = O(n)
  public static int[] brt(int[] nums){

    int n = nums.length;

    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();

    for(int num : nums){
      int sign = Integer.signum(num);

      if (sign > 0) { pos.add(num); }
        else neg.add(num);
    }

    for(int i=0; i<n/2; i++){

      nums[2*i] = pos.get(i);
      nums[2*i + 1] = neg.get(i);
    }

    return nums;
  }

  //tc = O(n) and sc = O(n)
  public static int[] opt(int[] nums){

    int n = nums.length;
    int[] ans = new int[n];
    int pos = 0;
    int neg = 1;

    for(int i=0; i<n; i++){

      if(nums[i] > 0){
        ans[pos] = nums[i];
        pos += 2;
      } else {
        ans[neg] = nums[i];
        neg += 2;
      }
    }

    return ans;
  }


  
  public static void main(String[] args) {
    
    brt(new int[] {3,-2,-4,8,-2,1});
    
    opt(new int[] {3,-2,-4,8,-2,1});
  }
}
