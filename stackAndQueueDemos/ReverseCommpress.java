package stackAndQueueDemos;
//returns reversed string with no repeating symbols

import java.util.Scanner;
import java.util.Stack;

public class ReverseCommpress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String str = in.nextLine();
        int length = str.length();
        stack.push(str.charAt(0));
        for (int i = 1; i < length; i++) {
            char ch =  str.charAt(i);
            if( ch != stack.peek()) {
                stack.push(ch);
            }
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
