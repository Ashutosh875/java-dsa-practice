public class Rec_01_print {

  public static void main(String[] args) {
    // recursion function called
    recFn(0);
  }

  public static void recFn(int count){

    // base condition to avoid stack-overflow,
    // we must have a base condition to stop 
    // infinite recursion calls and run out of memory
    if(count == 10)
      // when condition is met function returns and 
      // terminates all the functions waiting in stack
      return;
    System.out.println(count+1);

    // function calls itself resulting into a recursion 
    recFn(count + 1);
  }
}
