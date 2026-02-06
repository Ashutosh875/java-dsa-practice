import java.util.Scanner;
class Pattern
{
  public void pattern1(int n){
    for (int i = 0 ; i < n ; i++){
      for(int j = 0 ; j < n ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public void pattern2(int n){
    for (int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public void pattern3(int n){
    for (int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        System.out.print(j+1 + " ");
      }
      System.out.println();
    }
  }
  public void pattern4(int n){
    for (int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        System.out.print(i+1 + " ");
      }
      System.out.println();
    }
  }
  public void pattern5(int n){
    for (int i = 1 ; i <= n ; i++){
      for(int j = 0 ; j < (n-i+1) ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public void pattern6(int n){
    for (int i = 1 ; i <= n ; i++){
      for(int j = 0 ; j < (n-i+1) ; j++){
        System.out.print(j+1 + " ");
      }
      System.out.println();
    }
  }
  public void pattern7(int n)
  {
    for (int i = 0 ; i < n ; i++)
    {
      // sapce
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }
      // star
      for(int j = 0 ; j < i*2+1 ; j++){
        System.out.print("*");
      }
      //space
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public void pattern8(int n)
  {
    for (int i = 0 ; i < n ; i++)
    {
      // sapce
      for(int j= 0 ; j < i ; j++){
        System.out.print(" ");
      }
      // star
      for(int j = 0 ; j < 2*n - (2*i + 1); j++){
        System.out.print("*");
      }
      //space
      for(int j= 0 ; j < i; j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public void pattern9(int n){
    for (int i = 0 ; i < n ; i++)
    {
      // sapce
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }
      // star
      for(int j = 0 ; j < i*2+1 ; j++){
        System.out.print("*");
      }
      //space
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0 ; i < n ; i++)
    {
      // sapce
      for(int j= 0 ; j < i ; j++){
        System.out.print(" ");
      }
      // star
      for(int j = 0 ; j < 2*n - (2*i + 1); j++){
        System.out.print("*");
      }
      //space
      for(int j= 0 ; j < i; j++){
        System.out.print(" ");
      }
      System.out.println();
    }

  }
  public void pattern10(int n){

    for (int i = 0 ; i < n ; i++){
      for (int j = 0 ; j <= i ; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 0 ; i < n-1 ; i++){
      for (int j = 0 ; j < n-1-i ; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void pattern11(int n){
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        if( i % 2 == 0 && j%2 == 0){
          System.out.print("1 ");
        } else if( i % 2 != 0 && j%2 != 0){
          System.out.print("1 ");
        } else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }



  }
  public void pattern12(int n){
    int space = 2*(n-1);
    for (int i = 0 ; i < n ; i++){
      for (int j = 0 ;j <= i ; j++){
          System.out.print((j+1));
      }
      for(int j = 1 ; j < space ; j++){
          System.out.print(" ");
      }
      for (int j = i ;j >= 0 ; j--){
          System.out.print((j+1));
      }
      
      System.out.print("\n");
      space -= 2;
  }
  }
  public void pattern13(int n){
    int count = 1;
    for(int i = 1 ; i <= n ; i++ ){
      for (int j= 1 ; j <= i ; j++){
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }

  }
  public void pattern14(int n){
    int alpha = 65;
    for(int i = 0 ; i < n ; i++){
      for(int j = 0; j<=i ; j++){
        System.out.print((char)(alpha + j) + " ");
      }
      System.out.println();
    }

  }
  public void pattern15(int n){
    int alpha = 65;
    for(int i = 0 ; i < n ; i++){
      for(int j = 0; j<=n-1-i ; j++){
        System.out.print((char)(alpha + j) + " ");
      }
      System.out.println();
    }
  }
  public void pattern16(int n){
    for(int i=0 ; i<n ; i++){
      for(int j =0 ; j <=i ; j++){
        int alph = 65;
        System.out.print((char)(alph + i) + " ");
      }
      System.out.println();
    }
  }
  public void pattern17(int n){

    for (int i = 0 ; i < n ; i++)
    {
      // sapce
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }

      // chars
      int ch = 65;
      int breakpt = ((2*i) + 1)/2;
      for(int j = 0 ; j < i*2+1 ; j++){
        System.out.print(((char)ch) + " ");
        if(j < breakpt) {
          ch++;
        } else ch--;
      }

      //space
      for(int j = n ; j > i+1 ; j--){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public void pattern18(int n){
    for (int i = 1 ; i <= n ; i++){
      int start = (65+(n-1));
      for (int j= 1 ; j <= i ; j++){
        System.out.print((char)start + " ");
        start--;
      }
      System.out.println();
    }


  }
  public void pattern19(int n){
    for (int i = 0; i <n ; i++){
      
      //stars
      for(int j = n ; j > i ; j--){
        System.out.print("* ");
      }
      //space
      for (int j = 0 ; j < i*2 ; j++){
       System.out.print("  ");
      }
      // stars
      for(int j= n ; j > i ; j--){
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = 0; i < n ; i++){
      //stars
      for(int j = 0 ; j <= i ; j++){
        System.out.print("* ");
      }
      //space
      for (int j = n ; j > i*2 ; j--){
       System.out.print("  ");
      }
      // stars
      for(int j= 0 ; j <= i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

  }
  public void pattern21(int n){
    for(int i = 0; i<n ; i++){
      for (int j= 0 ; j<n; j++){
          if(i==0 || j == 0 || j == (n-1) || i == (n-1)){
              System.out.print("*");
          } else{
              System.out.print(" ");
          }
      }
      System.out.println();
  }
  }

}




public class ex1_1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // System.out.print("enter number of terms : ");
    // int n = sc.nextInt();

    Pattern obj = new Pattern();
    obj.pattern21(3);

    sc.close();
  }
}