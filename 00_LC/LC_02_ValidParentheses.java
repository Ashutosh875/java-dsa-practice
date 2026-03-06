import java.util.Stack;

class ValidParentheses{

  // time complexity = O(n²)
  // space complexity = O(n)
  public boolean validByBrute(String s){

    while(s.contains("()") || s.contains("[]") || s.contains("{}")){

      s.replace("()", "");
      s.replace("[]", "");
      s.replace("{}", "");

    }

    if(s.length() == 0) {
      return true;
    }else return false;
  }

  // time complexity = O(n)
  // space complexity = O(n)
  public boolean validByOpt(String s){

    if(s.length() % 2 != 0) return false;
        
      Stack<Character> stack = new Stack<>();

      for(int i=0; i<s.length(); i++){

          if(s.charAt(i) == '(') stack.push(')');
          else if(s.charAt(i) == '[') stack.push(']');
          else if(s.charAt(i) == '{') stack.push('}');

          else if(stack.isEmpty() || stack.pop() != s.charAt(i)){
              return false;
          }
      }

      return stack.isEmpty();
  }


}

public class LC_02_ValidParentheses {
  public static void main(String[] args) {
    
    String string = "()[)";

    ValidParentheses isValid = new ValidParentheses();

   isValid.validByBrute(string);
   isValid.validByOpt(string);
  }
}
