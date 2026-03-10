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

  public void intersection(int arr1[] , int arr2[]){

    List<Integer> inter = new ArrayList<>();

    //optimized Tc = O(n1 + n2)
    int i=0 , j=0;
    
    while( i<arr1.length && j<arr2.length){

      if(arr1[i] < arr2[j]){
        i++;
      }else if(arr1[i] > arr2[j]){
        j++;
      }else{
        inter.add(arr1[i]);
        i++;
        j++;
      }

    }
      
    // brute force TC = O(n²)
    // int[] vis = new int[arr2.length];
    
    // for(int i=0; i<arr1.length; i++){
    //   for(int j=0; j<arr2.length; j++){
    //     if(arr1[i] == arr2[j] && vis[j] == 0){
    //       inter.add(arr1[i]);
    //       vis[j] = 1;
    //       break;
    //     }
    //   }
    // }


    //print
    for(int x : inter){
      System.out.print(x + " ");
    }

  }



}

public class Array_09_UnionAndIntersection {
  public static void main(String[] args) {
    
    UnionAndIntersection obj = new UnionAndIntersection();

    obj.union(new int[] {1,1,2,2,3,4,4}, new int[] {1,1,2,2,3,3,3,4,4,4,4,5});

    System.out.println();

    obj.intersection(new int[] {1,1,2,2,3,4,5}, new int[] {1,2,2,4,4,5,6});

  }
}
