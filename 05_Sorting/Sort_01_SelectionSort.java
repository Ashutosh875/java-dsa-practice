public class Sort_01_SelectionSort {

  public static void selectionSort(int[] arr){
    int n = arr.length;
    for(int i=0; i<=n-2; i++){
      for(int j=i ; j<=n-1; j++){
        if(arr[i] > arr[j]){
          int c = arr[i];
          arr[i] = arr[j];
          arr[j] = c;
        }
      }
    }
    
    //print sorted array
    for(int i : arr){
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    
    selectionSort(new int[] {41,99,65,17,78,15,55});
    /* 
    * Selection sort is all about selectin the minimal and swapping it
    * observation here is Loop iterates over an index 0 to last index 
    * and with each iteration starting index increments by 1 upto 
    * second-last index 
    * the worst , best and average time complexity is O(N²)
    */
  }
}
