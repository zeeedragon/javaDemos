package questionnaire;

import java.util.ArrayList;

public class Choice extends Question {
    private ArrayList<String> choices;
    private ArrayList<Boolean> answers;

    public Choice() {
        super();
        this.choices = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    /*public void addChoice(String textChoice, boolean correct) {
        choices.add(textChoice);
        if (correct) {
            String str =  choices.size() + "";
            setAnswer(str);
        }
    }*/

    public void addChoice(String textChoice, boolean correct) {
        choices.add(textChoice);
        answers.add(correct);
        String listString = "";
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == true) {
                listString += (i + 1) + " ";
                setAnswer(listString.trim());
            }
        }
    }

    public void displayText() {
        super.displayText();
        int length = choices.size();
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + "  - " + choices.get(i));
        }
    }

    public void displayHelp() {
        System.out.println("Write the number of the correct answer");
    }
}
