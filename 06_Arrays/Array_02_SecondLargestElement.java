public class Array_02_SecondLargestElement {

  public static int secondLargest(int[] arr){

    int size = arr.length;
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int i=0; i<size; i++){

      if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
      } else if(arr[i] != largest &&  arr[i] > secondLargest ){
        secondLargest = arr[i];
      }
    }

    return secondLargest;
  }
  public static void main(String[] args) {
    
    int[] arr = {2,1,3,5,6,9,8,9};
    System.out.println(secondLargest(arr));
  }
}
