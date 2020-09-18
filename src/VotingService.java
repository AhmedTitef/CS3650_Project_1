import java.util.ArrayList;
import java.util.Arrays;

public class VotingService extends Question {



    //creates random answers depending on type
//    void chooseingAnswers(int randomAnswer){
//        System.out.println("Random answer is in Voting Service class = " + randomAnswer);
//        System.out.println("Random Answer chosen is " + getAnswers().get( randomAnswer ).count ++);
////        question.getAnswers().get( randomAnswer ).count ++;
//        System.out.println();
//    }



//    call the iVote Service output function to display the result
    void statistics(ArrayList<Answers> answers) {

        System.out.println("Statistics is : ");
       for (int i = 0 ; i< answers.size() ; i++){

           System.out.println(answers.get( i ).answer + " (" + answers.get( i ).count + ")");

       }
    }
}
