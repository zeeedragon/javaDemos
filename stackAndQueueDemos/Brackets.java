package stackAndQueueDemos;
//checking validity of parenthesis sequence

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequence = in.nextLine();
        int length = sequence.length();
        int err = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length && err == 0; i++) {
            char ch = sequence.charAt(i);
            if (setPriority(ch) > 0) {
                if (stack.isEmpty() || setPriority(ch) <= stack.peek()) {
                    stack.push(ch);
                } else {
                    err = 4;
                }
            } else {
                if (stack.isEmpty()) {
                    err = 2;
                } else if (setPriority(stack.peek()) + setPriority(ch) == 0) {
                        stack.pop();
                    } else {
                        err = 3;
                    }
                }
        }
        if (err == 0 && !stack.isEmpty()) {
            err = 1;
        }
        printResult(err);
    }

    static void printResult(int error) {
        switch (error) {
            case 0:
                System.out.println("correct");
                break;
            case 1:
                System.out.println("Open without close");
                break;
            case 2:
                System.out.println("Close without open");
                break;
            case 3:
                System.out.println("unmatching type");
                break;
            case 4:
                System.out.println("incorrect insert");
                break;
            default:
                System.out.println("n/a");
                break;
        }
    }

    static int setPriority(char ch) {
        switch (ch) {
            case '{':
                return 3;
            case '[':
                return 2;
            case '(':
                return 1;
            case ')':
                return -1;
            case ']':
                return -2;
            case '}':
                return -3;
            default:
                return 0;
        }
    }
}
