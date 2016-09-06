package stackAndQueueDemos;

import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        String firstLineInput = in.nextLine();
        String secondLineInput = in.nextLine();
        String[] getParameters = firstLineInput.split(" ");
        String[] getItemsForStack = secondLineInput.split(" ");

        in.close();

        int n = Integer.parseInt(getParameters[0]);
        int s = Integer.parseInt(getParameters[1]);
        int x = Integer.parseInt(getParameters[2]);
        int minEl = Integer.parseInt(getItemsForStack[0]);

        //populating stack from string arr
        for (String str : getItemsForStack) {
            if (stack.size() < n) {
                stack.push(Integer.parseInt(str));
            }
        }

        //pop s amount of els
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        boolean check = false;

        for (int num : stack) {
            if (num == x) {
                check = true;
            }
        }

        //final check
        if (check) {
            System.out.println(check);
        } else if (stack.size() > 0) {
            for (int num : stack) {
                if (minEl > num) {
                    minEl = num;
                }
            }
            System.out.println(minEl);
        } else {
            System.out.println(stack.size());
        }
    }
}

