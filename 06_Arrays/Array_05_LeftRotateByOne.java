public class Array_05_LeftRotateByOne {

  public static void leftRotateByOne(int[] arr){

    int n = arr.length;
    
    int temp = arr[0];
    for(int i=1; i<n; i++){
      arr[i-1] = arr[i];
    }
    arr[n-1] = temp;

    //print
    for(int a : arr){
      System.out.print(a + " ");
    }
  }
  public static void main(String[] args) {
    
    leftRotateByOne(new int[] {1,2,3,4,5});

    // time complexity = O(N)
    // space complexity for extra space = O(1)
    // but if asked SC in the Algo then = O(N) sice we using the array itself
  }
}
