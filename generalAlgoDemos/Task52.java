package generalAlgoDemos;

//52. ДСП, която моделира разпоредител на бар, който има вместимост n човека.
//В бара могат да влизат или излизат групи от хора. Ако групата е такава, че с
//нея се надвишават бройките от n човека, тя не може да влезе.
//Програмата да въвежда от клавиатурата числото n. След това с генератора
//нa случайни числа да се моделира пристигане на група или излизане на група.
// При пристигане на група броят на хората да се избира по случаен начин
// от 1 до n, а при напускане на група се избира по случаен начин число от
// 1 до броя на хората в бара. Ако групата може да влезе, програмата
// да печата “in – P”, където Р е броят на хората, които влизат. Ако не е
// възможно влизане да се отпечата „error in – B”, където В е броят на хората,
// за които няма място (които са в повече). При излизане на група да се отпечата
// “out – K”, където К е броят на излизащите хора. Този процес продължава
// докато не се извършат три последователни опита за вход на хора,
// които са в повече от свободните места.

import java.util.Random;
import java.util.Scanner;

public class Task52 {
    public static int out(int n) {
        if (n == 0) {
            return 0;
        }
        Random rand = new Random();
        int k = rand.nextInt(n) + 1; //cause nextInt returns n-1
        System.out.println("out - " + k);
        n -= k;
        return n;
    }

    public static int in(int maxn, int n) {
        Random rand = new Random();
        int k = rand.nextInt(maxn) + 1;
        if (k + n > maxn) {
            System.out.println("error in - " + (k + n - maxn));
        } else {
            System.out.println("in - " + k);
            n += k;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxn = in.nextInt();
        int n = 0;
        int br = 0;

        in.close();
        Random rand = new Random();
        while(br < 3) {
            int inOut = rand.nextInt(2); // 0 - out or 1 - in
            if(inOut == 0) {
                n = out(n);
                br = 0;
            } else {
                int k = in(maxn, n);
                if(k == n) {
                    br++;
                } else {
                    n = k;
                    br = 0;
                }
            }
        }
    }
}
