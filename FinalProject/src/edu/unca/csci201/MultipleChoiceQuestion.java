package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	
	public String Question;
	public String choiceA;
	public String choiceB;
	public String choiceC;
	public String choiceD;
	public String Answer;
	
	public MultipleChoiceQuestion(String Question, String choiceA, String choiceB, String choiceC, String choiceD, String Answer) {
		Question = Question;
		choiceA = choiceA;
		choiceB = choiceB;
		choiceC = choiceC;
		choiceD = choiceD;
		Answer = Answer;
	}
	
	public String getTheQuestionText() {
		return Question;
	}
	
	public boolean isCorrectAnswer(String answer) {
		if (answer==Answer) {
			return true;
		} else return false;
	}
	
	public String getCorrectAnswer() {
		return Answer;
	}
	

}
