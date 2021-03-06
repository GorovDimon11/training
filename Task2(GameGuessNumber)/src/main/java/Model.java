import java.util.ArrayList;

public class Model {
    public static final String INTERMEDIATE_BIGGER = "The number is bigger. ";
    public static final String INTERMEDIATE_SMALLER = "The number is smaller. ";
    public static final String STRANGE_INTERMEDIATE_BIGGER = "Why did you enter a number greater than the range starts with?) ";
    public static final String STRANGE_INTERMEDIATE_SMALLER = "Why did you enter a number less than the starting range?) ";
    static private String strangeInput = "";
    static private String intermediateAnswer = "";
    public static ArrayList<Integer> allAnswers = new ArrayList<Integer>();
    private static int nextMin;
    private static int nextMax;
    static int random;

    public static boolean guessInt(int num){
        if( num == random ){
            allAnswers.add(num);
            return false;
        }else if( num < random ){

            if(num > nextMin) {
                allAnswers.add(num);
                nextMin = num;
                strangeInput = "";
            }else{ strangeInput = STRANGE_INTERMEDIATE_SMALLER;}
            intermediateAnswer = INTERMEDIATE_BIGGER;
            return true;
        }else{

            if(num < nextMax) {
                allAnswers.add(num);
                nextMax = num;
                strangeInput = "";
            }else{ strangeInput = STRANGE_INTERMEDIATE_BIGGER;}
            intermediateAnswer = INTERMEDIATE_SMALLER;
            return true;
        }
    }

    public static void setRandom(){
        random = (int)Math.ceil(Math.random()*
                (nextMax - nextMin - 1) + nextMin);
    }

    public static void setPrimaryBarrier(int minBarrier, int maxBarrier){
        nextMin = minBarrier;
        nextMax = maxBarrier;
    }

    public String getIntermediateAnswer(){
        return strangeInput + intermediateAnswer;
    }

    public static ArrayList<Integer> getAllAnswers() {
        return allAnswers;
    }

    public static int getNextMax() {
        return nextMax;
    }

    public static int getNextMin() {
        return nextMin;
    }
}
