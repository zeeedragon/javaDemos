package stackAndQueueDemos;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithStacks {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String userLineOfNums = in.nextLine();
        Stack<Integer> stack = new Stack<>();
        for(String s: userLineOfNums.split("\\s")){
            stack.push(Integer.parseInt(s));
        }

        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
