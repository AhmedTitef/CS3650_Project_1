import java.util.ArrayList;
import java.util.Random;

public class Student extends Question {
    private String name;
    private int id;

    Student(int answer, ArrayList<Answers> answers) {

        Random random = new Random();
        this.id = random.nextInt( 100 );

        //submitting answer we need to get the array that has the answers and increase the count for that one answer


        answers.get( answer ).count++;


//        System.out.println("Type is:  " +  getType());
//        if (getType().equals( "TF" )){
//            System.out.println("TF");
//            Random random1 = new Random(  );
//            VotingService votingService = new VotingService( );
//            votingService.chooseingAnswers( random1.nextInt(2) );
//        }else if (getType().equals( "MC" )){
//            Random random1 = new Random(  );
//            VotingService votingService = new VotingService( );
//            votingService.chooseingAnswers( random1.nextInt(4) );
//        }else{
//            System.out.println("error");
//            System.exit( 1 );
//        }

        //this random for random answer
        //then the student votes


    }
}
