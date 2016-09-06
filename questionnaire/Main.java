package questionnaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FreeResponse q1 = new FreeResponse();
        q1.setText("Capital of Bulgaria");
        q1.setAnswer("Sofia");

        Choice q2 = new Choice();
        q2.setText("Year of establishment of Bulgaria");
        q2.addChoice("785", false);
        q2.addChoice("816", false);
        q2.addChoice("681", true);
        q2.addChoice("875", false);

        Choice q4 = new Choice();
        q4.setText("what is the location of the next winter olympics");
        q4.addChoice("Winter Palace, Sofia", false);
        q4.addChoice("Gangneung Hockey Centre, south Korea", true);
        q4.addChoice("Ta' Qali National Stadium, Malta", false);
        q4.addChoice("Sportpark De Toekomst, Amsterdam", false);

        //multichoice question demo
        MultiChoice q3 = new MultiChoice();
        q3.setText("What are bad foods?");
        q3.addChoice("alcohol", true);
        q3.addChoice("apples", false);
        q3.addChoice("meat", false);
        q3.addChoice("lard", false);
        q3.addChoice("soda", true);

        MultiChoice q5 = new MultiChoice();
        q5.setAnswer("Which are the 2 gymnasts who have have highest count of medals");
        q5.addChoice("Sofia Muratova", false);
        q5.addChoice("Svetlana Khorkina", false);
        q5.addChoice("Věra Čáslavská", true);
        q5.addChoice("Larisa Latynina", true);
        q5.addChoice("Nellie Kim", false);

        presentQuestion(q1);
        presentQuestion(q2);
        presentQuestion(q3);
        presentQuestion(q4);
        presentQuestion(q5);
        //here is to check the correct answer printed
        //System.out.println(q3.getAnswer());
    }

    public static void presentQuestion(Question q) {
        q.display();
        Scanner in = new Scanner(System.in);
        String attempt = in.nextLine();
        if(q.isCorrect(attempt)) {
            System.out.println("Correct");
        } else {
            System.out.println("Try again");
        }
    }
}
