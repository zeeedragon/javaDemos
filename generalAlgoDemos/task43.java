package generalAlgoDemos;

//43.ДСП, която чете от клавиатурата символен низ от един ред и печата:
//А) целият символен низ с главни букви. Остналите символи остават непроменени.
//Б) всяка втора буква от символния низ (в него могат да участват
//и други символи)
//В) всяка гласна да се замени с долна черта

import java.util.Scanner;

public class task43 {
    public static void main(String[] args) {
        underscoreVowel();
    }

    public static void underscoreVowel() {
        Scanner in = new Scanner(System.in);
        String blank = "";
        String underScore = "";
        String removeVowelBase = "";
        String s = in.nextLine();
        //toUpper
        System.out.println(s.toUpperCase());

        //strip non-letter chars
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                blank += s.charAt(i);
            }
        }

        //print every second letter

        for (int i = 0; i < blank.length(); i += 2) {
            removeVowelBase += blank.charAt(i);
        }

        System.out.println(removeVowelBase);

        //replace vowel with underscore
        for (int i = 0; i < removeVowelBase.length(); i++) {
            underScore = removeVowelBase.toLowerCase().replaceAll("[aeiou]", "_");
        }
        System.out.println(underScore);
    }
}
