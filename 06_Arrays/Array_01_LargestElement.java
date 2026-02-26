import java.util.List;

public class Array_01_LargestElement {

  public static int maxElement(List<Integer> list){
    int max = Integer.MIN_VALUE;

    for(Integer i : list){
      if(i >= max){
        max = i;
      }
    }
    return max;
  }
  public static void main(String[] args) {
    
    List<Integer> list = List.of(5,8,6,1,2,3,9,1,2,4);
    System.out.println(maxElement(list));
  }
}
