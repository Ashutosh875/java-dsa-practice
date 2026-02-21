public class Sort_03_InsertionSort {

  public static void insertionSort(int[] arr){
    int n = arr.length;

    for(int i=0; i<=n-1; i++){
      int j=i;
      while (j>0 && arr[j-1] > arr[j]) {
        int c = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = c;
        j--;
      }
    }

    //print
    for(int i : arr){
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    
    insertionSort(new int[] {6,8,4,2,7,1});
    /* 
    * insertion sort takes an element and put it in correct position
    * worst and average case will be of time complexity will be O(N²)
    * and the best case will be O(N) , when array is already sorted,  * so no swaps
    */
  }
}
