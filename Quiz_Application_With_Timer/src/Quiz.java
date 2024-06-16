import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    List<Question> Q;
    public Quiz() {
        this.Q = new ArrayList<>();
    }
    public void addQuestion(Question question){
         Q.add(question);
    }


    public void start(){
        int points=0;
        for(Question quest:Q){
            System.out.println(quest.getQuestion());
            String[] options = quest.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }

            Scanner sc=new Scanner(System.in);


            long startTime=System.currentTimeMillis();
            int choose=sc.nextInt();
            long timeTaken=System.currentTimeMillis()-startTime;

            if(timeTaken>10000) { //1 sec=1000 ms
                System.out.println("Time's Up!");
            }
            else if((choose-1) == quest.getCorrectAnswerIndex()){
                System.out.println("Right Answer!");
                points++;
            }else{
                System.out.println("Wrong Answer!");
            }

        }
        System.out.println("Your totally answered " + points + " question out of 10 correctly");



    }

}
