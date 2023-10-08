package Stack;

import java.util.Stack;

public class ValidParentheses {

//  public static boolean isValid(String s) {
//
//    if (s.length() % 2 != 0 || s.substring(0, 1).equals(")") || s.substring(0, 1).equals("}")  || s.substring(0, 1).equals("]")) {
//      return false;
//    }
//
//    Stack<String> stack = new Stack();
//
//    for (int i = 0; i < s.length(); i++) {
//      if (s.substring(i, i + 1).equals("(") || s.substring(i, i + 1).equals("{")  || s.substring(i, i + 1).equals("[")) {
//        stack.push(s.substring(i, i + 1));
//      } else if (s.substring(i, i + 1).equals(")") || s.substring(i, i + 1).equals("}")  || s.substring(i, i + 1).equals("]")) {
//        String current = s.substring(i, i + 1);
//        if (stack.isEmpty()) {
//          return false;
//        }
//        if (current.equals(")") && stack.peek().equals("(")) {
//          stack.pop();
//        } else if (current.equals("}") && stack.peek().equals("{")) {
//          stack.pop();
//        } else if (current.equals("]") && stack.peek().equals("[")) {
//          stack.pop();
//        } else {
//          return false;
//        }
//      }
//    }
//
//    if (stack.isEmpty()) {
//      return true;
//    } else {
//      return false;
//    }
//  }

  // more optimized version
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);
      if (current == '(' || current == '{' || current == '[') {
        stack.push(current);
      } else {
        // condition where it is a closing parentheses
        if (stack.isEmpty()) { // if the closing parentheses is
          return false;
        } else if (current == (')') && stack.peek() != ('(')) {
          return false;
        } else if (current == ('}') && stack.peek() != ('{')) {
          return false;
        } else if (current == (']') && stack.peek() != ('[')) {
          return false;
        } else {
          stack.pop();
        }

      }
    }
    return stack.isEmpty();
  }



  public static void main(String[] args) {
    System.out.println(isValid("([}}])"));

  }

}
