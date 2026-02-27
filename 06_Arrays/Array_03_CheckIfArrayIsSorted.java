public class Array_03_CheckIfArrayIsSorted {

  public static boolean isSorted(int[] arr){

    int len = arr.length;
    int prev = Integer.MIN_VALUE;

    for(int i=0; i<len; i++){
      if(arr[i] >= prev){
        prev = arr[i];
      } else 
        return false;
    }

    return true;
  }
  public static void main(String[] args) {
    
    int[] arr = {3,4,5,5,2};
    System.out.println(isSorted(arr));
  }
}
