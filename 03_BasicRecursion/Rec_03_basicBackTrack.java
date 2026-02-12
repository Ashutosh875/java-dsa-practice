public class Rec_03_basicBackTrack {

  // print 1 to N by bactracking
  public static void backTrack1ToN(int n){
    if(n < 1) return;
    backTrack1ToN(n-1);
    System.out.println(n);
  }

  // print N to 1 by bactracking
  public static void backTrackNTo1(int i , int n){
    if(i > n) return;
    backTrackNTo1(i+1, n);
    System.out.println(i);
  }

  public static void main(String[] args) {
    
    backTrack1ToN(5);
    backTrackNTo1(1, 5);
  }

  /* 
    BACKTRACKING TREE
    f(3)
      ->f(2)
        ->f(1)
          ->f(0) return 
              executes f(1) : print 1
                executes f(2) : print 2
                  executes f(3) : print 3
    
    *f(n) , where n = printing from 1 to n times*
  */
}
