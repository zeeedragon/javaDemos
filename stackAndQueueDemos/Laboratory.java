package stackAndQueueDemos;

//enter sets of 2 ints - num of lab and result of the experiment
//return if experiment is success
// if result from the 2 labs are identical - success
//sample input: 1 - 5; 1 - 2; 1 - 10; 2 - 5; 2 - 2; 1 - 15; 2 - 10; 2 - 15
//q1 = q2 = 5 2 10 15


import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Laboratory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedBlockingQueue<Integer> q1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Integer> q2 = new LinkedBlockingQueue<>();
        int lab = in.nextInt();
        int res = in.nextInt();

        while (lab != 0 && res != 0) {
            if (lab == 1) {

                q1.add(res);
            } else {
                q2.add(res);
            }
            lab = in.nextInt();
            res = in.nextInt();
        }
        System.out.println(q1.equals(q2)); // this compares by reference and since we have 2 different objects we get FALSE
        System.out.println();
        Iterator<Integer> it = q1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        if (compare(q1, q2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean compare(LinkedBlockingQueue<Integer> q1, LinkedBlockingQueue<Integer> q2) {
        if (q1.size() != q2.size()) {
            return false;
        }
        boolean comp = true;
        while (!q1.isEmpty() && comp) {
            comp = q1.remove() == q2.remove();
        }
        return comp;
    }

}
