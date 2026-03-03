import java.util.ArrayList;
import java.util.List;

public class Array_07_MovingAllZeroesToEnd {

  //Brute force : TC = O(2N) and SC = O(N)
  public static void bruteMoveZeroes(int[] arr){

    int n = arr.length;
    List<Integer> temp = new ArrayList<>();

    for(int i=0; i<n; i++){
      if(arr[i] != 0){
        temp.add(arr[i]);
      }
    } 
    
    int size = temp.size();
    for(int i=0; i<n; i++){

      if(i < size){
        arr[i] = temp.get(i);
      }else{
        arr[i] = 0;
      }
    }

    //print 
    for(int i : arr){
      System.out.print(i + " ");
    }
  }

  // optimized : Tc = O(N) and SC = O(1)
  public static void optMoveZeroes(int[] nums){

    int n = nums.length;

    int j = -1;
    for(int i=0; i<n; i++){
      if(nums[i] == 0){
        j = i;
        break;
      }
    }
    if(j == -1) return;
    
    for(int i=j+1; i<n; i++){
      if(nums[i] != 0){
        nums[j] = nums[i];
        nums[i] = 0;
        j++;
      }
    }

    //print
    for(int i : nums){
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,2,4,5,1};
    optMoveZeroes(arr);
  }
}
