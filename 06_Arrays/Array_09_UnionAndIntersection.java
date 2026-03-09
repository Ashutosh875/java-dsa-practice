import java.util.ArrayList;
import java.util.List;

class UnionAndIntersection{

  public void union(int arr1[] , int arr2[]){

    int i=0 , j=0;

    List<Integer> temp = new ArrayList<>();

    while(i < arr1.length && j< arr2.length){

      if(arr1[i] <= arr2[j]){
         if(temp.size() == 0 || 
              temp.get(temp.size() -1) != arr1[i]){ 
          temp.add(arr1[i]);
        } 
        i++;
      } else if (arr2[j] < arr1[i]){
          if(temp.size() == 0 || 
              temp.get(temp.size() -1) != arr2[j]){
            temp.add(arr2[j]);
        } 
        j++;
      }

    }

    while(i < arr1.length){
      if(temp.size() == 0 || 
              temp.get(temp.size() -1) != arr1[i]){ 
          temp.add(arr1[i]);
        } 
      i++;
    }

    while (j< arr2.length) {
      if(temp.size() == 0 || 
            temp.get(temp.size() -1) != arr2[j]){
        temp.add(arr2[j]);
        }  
      j++;
    }

    for(int x : temp){
      System.out.print(x + " ");
    }

  }



}

public class Array_09_UnionAndIntersection {
  public static void main(String[] args) {
    
    UnionAndIntersection obj = new UnionAndIntersection();

    obj.union(new int[] {1,1,2,2,3,4,4}, new int[] {1,1,2,2,3,3,3,4,4,4,4,5});


  }
}
