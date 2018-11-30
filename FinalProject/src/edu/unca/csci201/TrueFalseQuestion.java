package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	public String question;
	public boolean answer;
	
	TrueFalseQuestion(String question, boolean answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getTheQuestionText() {
		return question;
	}
	
	public boolean isCorrectAnswer(String theirAnswer) {
		if (theirAnswer.equalsIgnoreCase("true")&& answer==true) {
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
