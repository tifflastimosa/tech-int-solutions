package Stack;

import java.util.Stack;

public class BaseballGame {

  public static int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack();
    int finalScore = 0;
    for (int i = 0; i < operations.length; i++) {
        if (operations[i].equals("+")) {
          Integer top = stack.pop();
          Integer sum = top + stack.peek();
          stack.push(top);
          stack.push(sum);
        } else if (operations[i].equals("D")) {
          stack.push(stack.peek() * 2);
        } else if (operations[i].equals("C")){
          stack.pop();
        } else {
          Integer current = Integer.parseInt(operations[i]);
          stack.push(current);
        }
    }

    while (!stack.isEmpty()) {
      finalScore += stack.pop();
    }

    return finalScore;
  }

  public static void main(String[] args) {
    System.out.println(BaseballGame.calPoints(new String[]{"5","2","C","D","+"}));
  }

}
