package application;

import javafx.scene.control.TextField;

public class UpperLowerTotalScore {

	public static int player1TotalScore;
	public static int player2TotalScore;
	public static int player1TotalLowerScore;
	public static int player2TotalLowerScore;
	public static TextField fieldPlayer1, fieldPlayer2, bonusfield1, bonusfield2;

	public static void updatePlayer1Score(TextField player1Total, TextField lowerTotalPLayer1) {
		player1TotalScore = GetTheScores.totalScoresPlayer1();
		player1Total.setText(Integer.toString(player1TotalScore));
		updatePlayer1LowerSectionScore();
	}

	public static void updatePlayer2Score(TextField player2Total, TextField lowerTotalPlayer2) {
		player2TotalScore = GetTheScores.totalScoresPlayer2();
		player2Total.setText(Integer.toString(player2TotalScore));
		updatePlayer2LowerSectionScore();

	}

	public static void updatePlayer1LowerSectionScore() {
		fieldPlayer1 = Textfield.getTextfieldLowerPLayer1();
		player1TotalLowerScore = GetTheScores.totalScoresPlayer1LowerSec();
		player1TotalLowerScore += player1TotalScore;
		fieldPlayer1.setText(Integer.toString(player1TotalLowerScore));
		checkBonus1(player1TotalLowerScore);
	}

	public static void updatePlayer2LowerSectionScore() {
		fieldPlayer2 = Textfield.getTextfieldLowerPLayer2();
		player2TotalLowerScore = GetTheScores.totalScoresPlayer2LowerSec();
		player2TotalLowerScore += player2TotalScore;
		fieldPlayer2.setText(Integer.toString(player2TotalLowerScore));
		checkBonus2(player2TotalLowerScore);
	}

	private static void checkBonus1(int player1TotalLowerScore) {
		bonusfield1 = Textfield.getBonusTFPLayer1();
		int bonus = 35;
		if (player1TotalLowerScore >= 63) {
			bonusfield1.setText(Integer.toString(bonus));
			GetTheScores.addOnArrayListPlayer1LowerSec(bonus);
		}

	}

	private static void checkBonus2(int player2TotalLowerScore) {
		bonusfield2 = Textfield.getBonusTFPLayer2();
		int bonus = 35;
		if (player2TotalLowerScore >= 63) {		
			bonusfield2.setText(Integer.toString(bonus));
			GetTheScores.addOnArrayListPlayer2LowerSec(bonus);
		}

	}

}
