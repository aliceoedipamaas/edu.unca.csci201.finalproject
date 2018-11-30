package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	public String statement;
	public boolean answer;
	
	TrueFalseQuestion(String statement, boolean answer) {
		this.statement = statement;
		this.answer = answer;
	}
	
	public String getTheQuestionText() {
		return statement;
	}
	
	public boolean isCorrectAnswer(String theirAnswer) {
		if (theirAnswer=="true"&& answer==true) {
			return true;
		} else return false;
	}
	
	public String getCorrectAnswer() {
		String t = "True";
		String f = "False";
		if (answer==true) {
			return t;
		} else return f;
	}
	
}
