import java.util.Arrays;

public class Rec_06_RevesrseArray {

  // double pointer
  public static int[] revArray(int[] arr , int i , int j){

    // base-case
    if(i >= j) return arr;
    //swap
    int c = arr[i];
    arr[i] = arr[j];
    arr[j] = c;
    //recursion-call
    revArray(arr, i+1, j-1);
    return arr;
  }

  // single pointer
  public static int[] revArray1(int[] arr , int i){

    // size of array
    int n = arr.length;
    // base-case
    if(i >= n/2) return arr;
    //swap
    int c = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = c;
    //recursion-call
    revArray1(arr, i+1);
    return arr;
  }
  public static void main(String[] args) {
    
    int[] arr = {2,3,1,9,11,6,5,8};

    Arrays.stream(revArray(arr, 0, arr.length-1)).forEach(x->System.out.print(x + " "));

    System.out.println();
    
    Arrays.stream(revArray1(arr, 0)).forEach(x->System.out.print(x + " "));


  }
}
