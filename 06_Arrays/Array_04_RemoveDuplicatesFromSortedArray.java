import java.util.TreeSet;

public class Array_04_RemoveDuplicatesFromSortedArray {
  // brute force to remove duplicates
public static int BruteFremoveDuplicates(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }

        int count = 0;
        for(Integer i : set){
            nums[count++] = i;
        }

        return set.size();
    }

  // optimized
  public static int removeDuplicates(int[] nums) {
        
        int n = nums.length;

        int i = 0;

        for(int j=1; j<n; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }

  public static void main(String[] args) {
    
    int[] arr = {1,1,1,2,2,3,3,4,4};
    System.out.println(removeDuplicates(arr));

  }
}
