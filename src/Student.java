import java.util.ArrayList;
import java.util.Random;

public class Student {

    // contains indexes of the chosen answers
    ArrayList<Integer> multipleAnswersPerStudent;
    Student(ArrayList<Answers> answers, String type , int id) {

        multipleAnswersPerStudent  = new ArrayList<>();
        //answer is a random number that represents an index s
        Random random = new Random();



        //Submitting random answers depending on question type
        if (type.equals( "True False" )) {
            int answer = random.nextInt( 2 );
            answers.get( answer ).count++;

        } else if (type.equals( "Multiple Choice Single Submission" )) {
            int answer = random.nextInt( 4 );


            answers.get( answer ).count++;

        } else if (type.equals( "Multiple Choice Multiple Submissions" )) {

            // when array of answer is empty,  add first submission first


            int answer = random.nextInt( 4 );

            System.out.println( "Student with id: " + id + " has chosen his first answer" );
            multipleAnswersPerStudent.add( answer );

            //  student can at max  do 4 submissions
            for (int i = 1; i <= 4; i++) {


                // here picks two number randomly. if it is 0,  then student wont change answer, otherwise change it to something else
                int changedSubmission = random.nextInt( 2 );

                if (changedSubmission == 0) {
                    //dont change  submission


                } else if (changedSubmission == 1) {
                    // here student can submit another another,  but first check if it was already been chosen in the array or no, if not then add it, if it was chosen before then do not add it and do nothing
                    System.out.println( "Student with id: " + id + " has changed his answer" );
                    answer = random.nextInt( 4 );
                    if (!multipleAnswersPerStudent.contains( answer )) {
                        multipleAnswersPerStudent.add( answer );

                    }

                }

            }


            //here gets the last submission out of all submissions and adds count for it
            answers.get( multipleAnswersPerStudent.get( multipleAnswersPerStudent.size() - 1 ) ).count++;
//            System.out.println("and last submitted answer is: " + answers.get( multipleAnswersPerStudent.size()-1).answer);
            System.out.print("Student with id: " + id + " has submitted these answers: " );

//            System.out.println(multipleAnswersPerStudent.size());
            for (int i = 0 ; i < multipleAnswersPerStudent.size() ; i++){

                System.out.print( answers.get( multipleAnswersPerStudent.get( i )  ).answer + " ");

            }
//

            System.out.println();

        }

        //prints out answers submitted by one student





        //submitting answer we need to get the array that has the answers and increase the count for that one answer
        //single answer


        //creates a ability to pick multiple answers


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
