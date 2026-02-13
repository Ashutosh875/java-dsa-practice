/* 
  two way to implement summation of N numbers
  either by paramaterised or functional recursion.
  in parameterised way it carries parameters and prints whereas 
  in functional it returns the value
*/
public class Rec_04_summationOfN {

  //paramaterised
  public static void paraSum(int n , int sum){
    if(n < 1){
      System.out.println(sum);
      return;
    }
    paraSum(n-1, sum+n);
  }

  //functional pattern
  public static int summation(int n){
    if(n == 0) return 0;
    return n + summation(n-1);
  }
  public static void main(String[] args) {
    
    paraSum(5, 0);

    int result = summation(5);
    System.out.println(result);
  }

  /* 
    RECURSIVE TREE FOR FUNCTIONAL 
      f(5)
        -> 5 + f(4)                                     : return 5 + 4 + 3 + 2 + 1 + 0
              -> 4 + f(3)                               : return 4 + 3 + 2 + 1 + 0
                      -> 3 + f(2)                       : return 3 + 2 + 1 + 0 
                              -> 2 + f(1)               : return 2 + 1 + 0
                                      -> 1 + f(0)       : return 1 + 0
                                            -> 0        : base-case return 0
  */
}
