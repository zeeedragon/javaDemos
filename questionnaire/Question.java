package questionnaire;

public class Question {
    private String text;
    private String answer;

    public Question() {
        this.text = "";
        this.answer = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    //for testing purposes we are allowing getting of the answer
    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect(String response) {
        return answer.equals(response);
    }

    public void displayText() {
        System.out.println(text);
    }

    public void displayHelp() {
        //should be rewritten for each different type of question
    }

    public void display() {
        displayText();
        displayHelp();
        System.out.println("Answer: ");
    }
}
