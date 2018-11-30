package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	private Question[] questionsList = new Question[25];
	private String[] answersList = new String[25];
	
	
	public void addQuestion(Question q) {
		
		for (int i=0;i<questionsList.length;i++) {
			if (questionsList[i] == null) {
				questionsList[i] = q;
				break;
			}
		}
		for (int j=0;j<answersList.length;j++) {
			if (answersList[j] == null) {
				answersList[j] = q.getCorrectAnswer();
				break;
			}
		
		}
		
	}
	
	
	public double giveQuiz() {
		
		System.out.println("Please enter answers all in lowercase. Forget the shift key exists.")
		double score = 0.0;
		
		for (int i=0; i<questionsList.length; i++) {
			//questionsList[i] = questionsList[i];

			for (int j=0; j<answersList.length; j++) {
				System.out.println(questionsList[j].getTheQuestionText());
				
				
				answersList[j] = questionsList[j].getCorrectAnswer();
			
				Scanner scan = new Scanner(System.in);
				
				String a = scan.nextLine();
				
				
				if(a.equalsIgnoreCase(answersList[j])) {
					score++;
			}	else System.out.println("Incorrect. The correct answer is: " + questionsList[j].getCorrectAnswer());
	
				
			}		
	} return score;
		
	
	// close scanner pls
	
	}
	
}
