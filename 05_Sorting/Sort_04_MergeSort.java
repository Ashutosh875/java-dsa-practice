import java.util.ArrayList;
import java.util.List;

public class Sort_04_MergeSort {

  public static void merge(int[] arr, int low, int mid, int high) {
        
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        while (left <= mid)
            temp.add(arr[left++]);

        while (right <= high)
            temp.add(arr[right++]);

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
  public static void main(String[] args) {
    
    int[] arr = {3,2,1,2,4,1,5,2,3,1};
    mergeSort(arr, 0, arr.length-1);
    for(int i : arr){
      System.out.print(i + " ");
    }
  }
}
