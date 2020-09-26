import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {

    //create a question type and configure the answers;
    private String type;
    private ArrayList<Answers> answersArray;


//    public static void main(String[] args) {
//        SimulationDriver simulationDriver = new SimulationDriver();
//        simulationDriver.createQuestionType();
//        VotingService votingService = new VotingService( simulationDriver.type , simulationDriver.answersArray);
//        votingService.acceptingAdmissions();
//        simulationDriver.createAQuestion();
//        simulationDriver.configureTheAnswers();
//        simulationDriver.generateStudents();
////        simulationDriver.submitAnswersToiVoteService( 1 );
//        simulationDriver.outputResults();
//
//    }






    void createQuestionType(){
        Random randomType = new Random(  );
//        int randomNumber = randomType.nextInt( 2 ) + 1;
        int randomNumber = 3;
        if (randomNumber == 1){
            type = "True False";
        } else if (randomNumber == 2) {
            type = "Multiple Choice";
        }
        else if (randomNumber == 3){
            type = "Multiple Choice Multiple Submissions";
        }

//        type = "Multiple Choice";

    }

    void configureTheAnswers() {
        if (type.equals( "True False" )) {
            generateTrueFalseQuestions();
        } else if (type.equals( "Multiple Choice" )) {
            generateMultipleChoiceQuestions();
        }else if (type.equals( "Multiple Choice Multiple Submissions" )){
            generateMultipleChoiceQuestions();
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

    void createAQuestion() {

        Question question = new Question();
        System.out.println( "Creating a Question........" );
        question.createAQuestion();
//        System.out.println(question.getAnswers().get( 1 ).count);


    }


    //randomly generate a number students and the answers
    void generateStudents() {

        System.out.println( "Creating Students........" );

        ArrayList<Integer> uniqueIDArray = new ArrayList<>(  );
        Random random = new Random();
        int numberOFStudents = random.nextInt( 40 ) + 1; //only creating 40 students max
        for (int i = 1; i <= numberOFStudents; i++) {

            // create unique id number;
//            while (!uniqueIDArray.contains( id )){
//                uniqueIDArray.add( id );
//                new Student( answersArray, type , id );
//            }
            // if this id been used before, create a new one and check

                while (true){
                   int id = random.nextInt( 20000 );
                    if (!uniqueIDArray.contains( id )){
                        uniqueIDArray.add( id );
                        new Student( answersArray, type , id );
                        break;
                    }


                }


            //inside student, it creates an automatic answer with student creation



        }

        System.out.println( "Number of students created is: " + numberOFStudents );

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
