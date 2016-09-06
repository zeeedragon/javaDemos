package stackAndQueueDemos;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BooleanPostFixCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();
        int length = expression.length();
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for (int i = 0; i < length; i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                int dig = ch - '0';
                dq.addLast(dig);
            } else if (ch == '~') {
                dq.addLast(calcUnary(ch, dq.removeFirst()));
            } else {
                dq.addLast(calcBinary(ch, dq.removeFirst(), dq.removeFirst()));
            }
        }
        System.out.println("->" + dq.peekFirst());
    }

    public static int calcUnary(char ch, int x) {
        if (ch == '~') {
            if(x == 1){
                return 0;
            } else {
                return 1;
            }
        }
        return 3000;
    }

    public static int calcBinary(char ch, int x, int y) {
        if (ch == '^') {
            if (x == 1 &&  y == 1) {
                return 1;
            } else {
                return 0;
            }
        } else if (ch == 'v') {
            if (x == 1 || y == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        return 2000;
    }
}
