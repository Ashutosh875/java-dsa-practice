public class Array_08_LinearSearch {

  public static int linearSearch(int[] nums , int k){
    
    for(int i=0; i<nums.length; i++){
      if(nums[i] == k){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    
    int index = linearSearch(new int[] {1,3,4,5,4,6,7,8} , 8);
    System.out.println(index);
  }
}
