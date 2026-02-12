public class Rec_02_printNtimes {

  //Printing name N times using recursion
  public static void printName(int i , int n){
    if(i > n) return;
    System.out.println("Ashutosh");
    printName(i+1, n);
  }

  //Printing 1 to N
  public static void print1ToN(int i , int n){
    if(i > n) return;
    System.out.println(i);
    print1ToN(i+1, n);
  }

  //Printing N to 1
   public static void printNto1(int i , int n){
    if(i < 1) return;
    System.out.println(i);
    printNto1(i-1, n);
  }

  public static void main(String[] args) {
    printName(1, 5);
    print1ToN(1, 5);
    printNto1(5, 5);
  }
}
