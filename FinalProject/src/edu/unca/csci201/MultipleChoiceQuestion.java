package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	
	public String Question;

	public String Answer;
	
	public MultipleChoiceQuestion(String Question, String Answer) {
		this.Question = Question;
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
