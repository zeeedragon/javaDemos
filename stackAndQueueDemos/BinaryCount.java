package stackAndQueueDemos;

//read a binary num as a string; check if count of 0s = count of 1s;

import java.util.Scanner;
import java.util.Stack;

public class BinaryCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        Stack<Character> matchers = new Stack<Character>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (matchers.isEmpty() || matchers.peek() == ch) {
                matchers.add(ch);
            } else {
                matchers.pop();
            }
        }
        if (matchers.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
