package softuni.calculateSequenceWithQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long start = in.nextLong();
        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.addFirst(start);
        for (int i = 0; i < 50; i++) {
            Long current = queue.removeFirst();
            System.out.printf("%s ", current);

            Long s1 = current + 1;
            Long s2 = 2 * current + 1;
            Long s3 = current + 2;

            queue.addLast(s1);
            queue.addLast(s2);
            queue.addLast(s3);

        }
    }
}
