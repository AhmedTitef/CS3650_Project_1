public class Main {
    public static void main(String[] args) {





        SimulationDriver simulationDriver = new SimulationDriver();
        simulationDriver.createQuestionType();
        simulationDriver.createAQuestion();
        simulationDriver.configureTheAnswers();
        simulationDriver.generateStudents();
//        simulationDriver.submitAnswersToiVoteService( 1 );
        simulationDriver.outputResults();


    }
}
