public class View {
    public static final String INPUT_INT = "Try to guess the number between ";
    public static final String RIGHT_INT = "You guess the number!!! Congratulations!!!";
    public static final String WRONG_INPUT = "You entered incorrectly. Please, try again.";

    public void printMessage(String message){
        System.out.println(message);
    }

    public static String printRange(){
        return Model.getNextMin() + " and " + Model.getNextMax() + " :";
    }

    public static String printAnswersArray(){
        return "\n Your answers: " + Model.getAllAnswers().toString();
    }
}
