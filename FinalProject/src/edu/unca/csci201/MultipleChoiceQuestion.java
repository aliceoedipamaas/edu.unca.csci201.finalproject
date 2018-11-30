package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	
	public String Question;
	public String A;
	public String B;
	public String C;
	public String D;
	public String Answer;
	
	public MultipleChoiceQuestion(String Question, String choiceA, String choiceB, String choiceC, String choiceD, String Answer) {
		Question = Question;
		this.A = choiceA;
		this.B = choiceB;
		this.C = choiceC;
		this.D = choiceD;
		this.Answer = Answer;
	}
	
	public String getTheQuestionText() {
		return Question;
	}
	
	public boolean isCorrectAnswer(String theirAnswer) {
		if (theirAnswer.equalsIgnoreCase(Answer)) {
			return true;
		} else return false;
	}
	
	public String getCorrectAnswer() {
		return Answer;
	}
	

}
