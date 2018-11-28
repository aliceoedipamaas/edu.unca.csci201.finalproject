package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	public String statement;
	public boolean answer;
	
	TrueFalseQuestion(String statement, boolean answer) {
		statement = statement;
		answer = answer;
	}
	
	public String getTheQuestionText() {
		return statement;
	}
	
	public boolean isCorrectAnswer(String theirAnswer) {
		if (theirAnswer=="true"&& answer==true) {
			return true;
		} 
		// keep working on this method pls
		else return false;
	}
	
	public String getCorrectAnswer() {
		String t = "True";
		String f = "False";
		if (answer==true) {
			return t;
		} else return f;
	}
	
}
