package edu.unca.csci201;

public class Quiz {
	
	Question[] questionsList = new Question[26];

	public void addQuestion(Question q) {
		
		
		
	}
	
	public double giveQuiz() {
		
		for (int i=0; i<questionsList.length; i++) {
			System.out.println(questionsList[i].getTheQuestionText());
		}
		
		// keep working
		
	}
	
}
