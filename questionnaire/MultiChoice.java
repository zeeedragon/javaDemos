package questionnaire;

import java.util.ArrayList;


public class MultiChoice extends Choice {
    //private ArrayList<Boolean> answers;

    public MultiChoice() {
        super();
        //this.answers = new ArrayList<>();
    }

    /*@Override
    public void addChoice(String textChoice, boolean correct) {
        super.addChoice(textChoice, correct);
        answers.add(correct);
        String listString = "";
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == true) {
                listString += (i + 1) + " ";
                setAnswer(listString.trim());
            }
        }
    }
*/
    public void displayHelp() {
        System.out.println("Enter the NUMBERS of the correct answers in a single line, separated by space");
    }
}
