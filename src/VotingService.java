import java.util.ArrayList;
import java.util.Arrays;

public class VotingService  {

    String questionType;
    ArrayList<Answers> answersArrayList;

//    VotingService(String questionType , ArrayList<Answers> answersArrayList){
//        this.questionType = questionType;
//        this.answersArrayList = answersArrayList;
//    }


//    call the iVote Service output function to display the result
    void statistics(ArrayList<Answers> answers) {

        System.out.println("Statistics are : (Final Submissions)");
       for (int i = 0 ; i< answers.size() ; i++){

           System.out.println(answers.get( i ).answer + " (" + answers.get( i ).count + " students voted."+  ")");

       }
    }
}
