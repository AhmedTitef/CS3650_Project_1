import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimulationDriver implements Question {

    //create a question type and configure the answers;
    private String type;
    private ArrayList<Answers> answersArray;


//    public static void main(String[] args) {
//        SimulationDriver simulationDriver = new SimulationDriver();
//        simulationDriver.createQuestionType();
//        VotingService votingService = new VotingService( simulationDriver.type , simulationDriver.answersArray);
//        simulationDriver.createAQuestion();
//        simulationDriver.generateStudents();
//        simulationDriver.configureTheAnswers();
//
//        // submit answers to ivote service
//
//
//
//
////        simulationDriver.submitAnswersToiVoteService( 1 );
//        simulationDriver.outputResults();
//
//    }






    @Override
    public void createQuestionType(){
        Random randomType = new Random(  );
//        int randomNumber = randomType.nextInt( 3 ) ;
        int randomNumber = 2;
        if (randomNumber == 0){
            type = "True False";

        } else if (randomNumber == 1) {
            type = "Multiple Choice Single Submission";
        }
        else if (randomNumber == 2){
            type = "Multiple Choice Multiple Submissions";
        }else{

        }
        System.out.println("Generated Question Type is: " + type);
//        type = "Multiple Choice";

    }

    @Override
    public void createInputQuestion() {

        System.out.println("Random Question has been created..");
//        Scanner scanner = new Scanner( System.in );
//
//        String question;
//            System.out.println( "Please Type your Question" );
//            question = scanner.nextLine();
//            System.out.println( "Question Created is " + question );
//        System.out.println( "Please Choose your Question Type: Multiple Choice(MC) or True and False (TF)" );
//        this.type = scanner.nextLine();






    }



    void configureTheAnswers() {
        switch (type) {
            case "True False":
                generateTrueFalseQuestions();
                break;
            case "Multiple Choice Single Submission":
            case "Multiple Choice Multiple Submissions":
                generateMultipleChoiceQuestions();
                break;
        }
    }

    void generateMultipleChoiceQuestions() {
        System.out.println( "Automatically creating 4 answers " );
        this.answersArray = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            Random r = new Random();
            char c = ((char) (r.nextInt( 26 ) + 'a'));
            String oneAnswer = Character.toString( c );
            Answers answers = new Answers( oneAnswer, 0 );
            answersArray.add( answers );

        }

        System.out.println( "Answers are : " );
        for (int i = 0; i < answersArray.size(); i++) {

            System.out.println( answersArray.get( i ).answer );

        }
    }




    void generateTrueFalseQuestions() {

        System.out.println( "Creating True and False Answers" );
        this.answersArray = new ArrayList<>();
        Answers answer1 = new Answers( "True", 0 );
        Answers answer2 = new Answers( "False", 0 );
        this.answersArray.add( answer1 );
        this.answersArray.add( answer2 );
//        System.out.println( Arrays.toString( answersArray.toArray() ) );
//        this.answer1 = "True";¬
//        this.answer2 = "False";

    }




    //randomly generate a number students and the answers
    void generateStudents() {

        System.out.println( "Creating Students........" );

        ArrayList<Integer> uniqueIDArray = new ArrayList<>(  );
        Random random = new Random();
        int numberOFStudents = random.nextInt( 20 - 4 ) + 1; //only creating 40 students max
        System.out.println( "Number of student(s) created is: " + numberOFStudents );
        for (int i = 1; i <= numberOFStudents; i++) {

            // create unique id number per student;
//
//            }
            // if this id been used before, create a new one and check

                while (true){
                   int id = random.nextInt( 100000 );
                    if (!uniqueIDArray.contains( id )){
                        uniqueIDArray.add( id );
                        // generates the answers inside each student
                        new Student( answersArray, type , id );
                        break;
                    }


                }






        }



    }

    void generateMultipleAnswersPerStudent(){

    }


//    void submitAnswersToiVoteService(int randomStudentAnswer) {
//        VotingService votingService = new VotingService();
//        votingService.chooseingAnswers( randomStudentAnswer );
//
//
//    }


    void outputResults() {
        VotingService votingService = new VotingService();
        votingService.statistics( answersArray );
    }
}
