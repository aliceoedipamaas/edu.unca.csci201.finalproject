package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
		Quiz quiztyme = new Quiz();
		
		quiztyme.addQuestion(new TrueFalseQuestion("this is correct", true));
		
		
		quiztyme.addQuestion(new TrueFalseQuestion("Thomas Pynchon is one of the best novelists of the twentieth century.", true));
		quiztyme.addQuestion(new MultipleChoiceQuestion("Which of these books won the National Book Award for Fiction in 1974?","a. The Moviegoer","b. Herzog","c. Gravity's Rainbow", "d. Catch-22","c"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Why was Gravity's Rainbow snubbed for the Pulitzer Prize in Fiction?","the scat scene"));
		quiztyme.addQuestion(new TrueFalseQuestion("The Crying of Lot 49 was published in 1968.", false));
		quiztyme.addQuestion(new ShortAnswerQuestion("Who is the protagonist of The Crying of Lot 49?","Oedipa Maas"));
		quiztyme.addQuestion(new ShortAnswerQuestion("What is Thomas Pynchon's middle name?","Ruggles"));
		quiztyme.addQuestion(new ShortAnswerQuestion("What is his wife's occupation?","literary agent"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Which is his shortest novel?","The Crying of Lot 49"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Which is his longest novel?","Against the Day"));
		quiztyme.addQuestion(new ShortAnswerQuestion("What is the number of the asteroid named after Pynchon?","152319"));
		quiztyme.addQuestion(new MultipleChoiceQuestion("Which of these lines is contained in the chorus prologue to the play Romeo and Juliet?",
				"a. She should have died hereafter","b. Hell is empty and all the devils are here.","c. But soft, what light through yonder window breaks!", "d. A pair of star-cross'd lovers take their life","D"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Who are the starcrossed lovers in Gravity's Rainbow?","Roger Mexico and Jessica Swanlake."));
		quiztyme.addQuestion(new ShortAnswerQuestion("What is the significance of their names?","The ballet Swan Lake was composed by Tchaikovsky. Tchaikovsky also composed a piece based on Romeo and Juliet."));
		quiztyme.addQuestion(new ShortAnswerQuestion("In alphabetical order, what two books won the National Book Award in 1973?","Augustus and Chimera"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Who wrote Augustus?","John Williams"));
		quiztyme.addQuestion(new MultipleChoiceQuestion("What else did John Williams write?","a. Stoner","b. Dubliners","c. Black Beauty","d. The Big Sleep", "d"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Who wrote Chimera?","John Barth"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Which state is John Barth from?", "Maryland"));
		quiztyme.addQuestion(new MultipleChoiceQuestion("Which university did he teach at?","a. University of Maryland", "b. St. Mary's College", "c. John Hopkins University", "d. University of Missouri", "c"));
		quiztyme.addQuestion(new MultipleChoiceQuestion("Which of these books was also written by John Barth?", "a. The Beekeeper's Manual", "b. Ambrose", "c. House of Leaves", "d. Lost in the Funhouse", "d"));
		quiztyme.addQuestion(new ShortAnswerQuestion("Who is the best Pynchonesque author of the fin de siecle?", "Elfriede Jelinek"));
		quiztyme.addQuestion(new ShortAnswerQuestion("In her book The Piano Teacher, who are the protagonist's two favorite composers (in alphabetical order)?","Bach and Schubert."));
		quiztyme.addQuestion(new TrueFalseQuestion("She attended the ceremony when she won the Nobel Prize for Literature.", false));
		quiztyme.addQuestion(new ShortAnswerQuestion();
		quiztyme.addQuestion(new ShortAnswerQuestion();
		
		
		quiztyme.giveQuiz();
		
		

	}

}
