package application;

import javafx.scene.control.TextField;

public class UpperLowerTotalScore {

	public static int player1TotalScore;
	public static int player2TotalScore;
	public static int player1TotalLowerScore;
	public static int player2TotalLowerScore;
	public static TextField fieldPlayer1, fieldPlayer2, bonusfield1, bonusfield2, player1Total, player2Total;

	public static void updatePlayer1Score() {
		player1TotalScore = GetTheScores.totalScoresPlayer1();
		Scores.setUpdatedScore1(player1TotalScore);
		player1Total = Textfield.getPlayer1Total();
		player1Total.setText(Integer.toString(Scores.getUpdatedScore1()));
		updatePlayer1LowerSectionScore();
		
	}

	public static void updatePlayer2Score() {
		player2TotalScore = GetTheScores.totalScoresPlayer2();
		Scores.setUpdatedScore2(player2TotalScore);
		player2Total = Textfield.getPlayer2Total();
		player2Total.setText(Integer.toString(Scores.getUpdatedScore2()));
		updatePlayer2LowerSectionScore();

	}

	public static void updatePlayer1LowerSectionScore() {
		fieldPlayer1 = Textfield.getTextfieldLowerPLayer1();
		player1TotalLowerScore = GetTheScores.totalScoresPlayer1LowerSec();
		player1TotalLowerScore += player1TotalScore;
		Scores.setUpdatedScore1Lower(player1TotalLowerScore);
		fieldPlayer1.setText(Integer.toString(Scores.getUpdatedScore1Lower()));
		checkBonus1();
	}

	public static void updatePlayer2LowerSectionScore() {
		fieldPlayer2 = Textfield.getTextfieldLowerPLayer2();
		player2TotalLowerScore = GetTheScores.totalScoresPlayer2LowerSec();
		player2TotalLowerScore += player2TotalScore;
		Scores.setUpdatedScore2Lower(player2TotalLowerScore);
		fieldPlayer2.setText(Integer.toString(Scores.getUpdatedScore2Lower()));
		checkBonus2();
	}

	private static void checkBonus1() {
		bonusfield1 = Textfield.getBonusTFPLayer1();
		int bonus = 35;
		if (Scores.getUpdatedScore1Lower() >= 63) {
			bonusfield1.setText(Integer.toString(bonus));
			System.out.println(player1TotalLowerScore);
		}

	}

	private static void checkBonus2() {
		bonusfield2 = Textfield.getBonusTFPLayer2();
		int bonus = 35;
		if (Scores.getUpdatedScore2Lower() >= 63) {
			bonusfield2.setText(Integer.toString(bonus));
		}

	}

}
