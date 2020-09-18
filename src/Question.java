import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question {

    private String question;

    public String getType() {
        return type;
    }

    private String type;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;



    private ArrayList<Answers> answers;
    Scanner scanner = new Scanner( System.in );

    Question() {


    }

    void createAQuestion() {

        System.out.println( "Please Type your Question" );
        this.question = scanner.nextLine();
        System.out.println( "Question Created is " + this.question );
//        System.out.println( "Please Choose your Question Type: Multiple Choice(MC) or True and False (TF)" );
//        this.type = scanner.nextLine();





    }



//    void questionType() {
//
//        System.out.println("QuestionType Function");
//        if (this.type.equals( "TF" )) {
//
//            System.out.println("Type is:  " +  getType());
//            showTrueFalse();
//        } else if (this.type.equals( "MC" )) {
//            showMultipleChoice();
//
//        } else {
//            System.out.println( "Error" );
//            System.exit( 1 );
//        }
//
//    }



//    void showTrueFalse() {
//        System.out.println("Creating True and False Answers");
//        this.answers = new ArrayList<>();
//        Answers answer1 = new Answers( "True" , 0 );
//        Answers answer2 = new Answers( "False" , 0 );
//        this.answers.add( answer1 );
//        this.answers.add( answer2 );
//        System.out.println( Arrays.toString( answers.toArray() ) );
////        this.answer1 = "True";¬
////        this.answer2 = "False";
//
//    }

//    void showMultipleChoice() {
//        this.answers = new ArrayList<>();
//        String userInput;
//        System.out.println( "Automatically creating 4 answers " );
//        char [] answers = new char[]{'A' , 'B' , 'C' , 'D'};
//
//        for (int i = 1; i <= 4; i++) {
//            Random random = new Random(  );
//
//
//            System.out.println( "Answer number  : "  );
//            userInput = scanner.nextLine();
//            Answers answer = new Answers( userInput , 0 );
//            answers.add( answer );
//
//        }
//
//        System.out.println( Arrays.toString( answers.toArray() ) );
//    }
    public ArrayList<Answers> getAnswers() {
        return answers;
    }


}

