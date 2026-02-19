public class Sort_02_BubbleSort {

  public static void bubbleSort(int[] arr){
    int n = arr.length;

    for(int i=n-1; i>0; i--){
      for(int j=0; j<=i-1; j++){
        if(arr[j] > arr[j+1]){
          int c = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = c;
        }
      }
    }

    // print
    for(int i : arr){
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    
    bubbleSort(new int[] {13,46,24,52,20,10});

    /* 
    * bubble sort is about pushing the maximum at the
    * last by adjacent swapping of values
    */
  }
}