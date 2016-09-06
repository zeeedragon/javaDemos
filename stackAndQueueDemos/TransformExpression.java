package stackAndQueueDemos;

import java.util.Scanner;
import java.util.Stack;

//32 + 45 + *1
public class TransformExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push((double) Character.getNumericValue(ch));
            } else {
                stack.push(calcExpression(stack.pop(), stack.pop(), ch));
            }
        }
        System.out.println("->" + stack.peek());
    }

    public static double calcExpression(double x, double y, char c) {
        switch (c) {
            case '+':
                return x + y;
            case '-':
                return y - x;
            case '*':
                return x * y;
            case '/':
                return y / x;
            default:
                return 0;
        }
    }
}
