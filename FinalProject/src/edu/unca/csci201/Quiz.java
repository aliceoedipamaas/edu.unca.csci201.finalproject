package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	
	Question[] questionsList = new Question[26];
	String[] answersList = new String[26];
	
	
	public void addQuestion(Question q) {
		
		// how to append
		
	}
	
	
	public double giveQuiz() {
		
		double score = 0.0;
		
		for (int i=0; i<questionsList.length; i++) {
			questionsList[i] = questionsList[i];
			
			for (int j=0; j<answersList.length; j++) {
				answersList[j] = questionsList[j].getCorrectAnswer();
			
				Scanner scan = new Scanner(System.in);
				
				String a = scan.nextLine();
				
				System.out.println(questionsList[i].getTheQuestionText());
				
				if(a.equalsIgnoreCase(answersList[j])) {
					score++;
			}		
				
		}
	} return score;
		
	
	// close scanner pls
	
	}
	
}
