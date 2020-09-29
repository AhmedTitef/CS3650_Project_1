public class Main {
    public static void main(String[] args) {





        SimulationDriver simulationDriver = new SimulationDriver();
        simulationDriver.createInputQuestion();
        simulationDriver.createQuestionType();

        simulationDriver.configureTheAnswers();
        simulationDriver.generateStudents();

        simulationDriver.outputResults();


    }
}
