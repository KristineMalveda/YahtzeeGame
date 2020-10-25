package application;

import java.util.ArrayList;

import javafx.scene.control.TextField;

public class PlayersTotalScore {

	static int player1TotalScore, player2TotalScore;

	static void updatePlayer1Score(ArrayList<TextField> player1Fields, TextField player1Total) {
		player1TotalScore = 0;

		if (!player1Fields.get(0).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(0).getText());
		}
		if (!player1Fields.get(1).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(1).getText());
		}
		if (!player1Fields.get(2).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(2).getText());
		}
		if (!player1Fields.get(3).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(3).getText());
		}
		if (!player1Fields.get(4).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(4).getText());
		}
		if (!player1Fields.get(5).getText().isBlank()) {

			player1TotalScore += Integer.valueOf(player1Fields.get(5).getText());
		}
		
		player1Total.setText(Integer.toString(player1TotalScore));
	}

	static void updatePlayer2Score(ArrayList<TextField> player2Fields, TextField player2Total) {

		player2TotalScore = 0;
		if (!player2Fields.get(0).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(0).getText());
		
		}
		if (!player2Fields.get(1).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(1).getText());
		}
		if (!player2Fields.get(2).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(2).getText());
		}
		if (!player2Fields.get(3).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(3).getText());
		}
		if (!player2Fields.get(4).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(4).getText());
		}
		if (!player2Fields.get(5).getText().isBlank()) {

			player2TotalScore += Integer.valueOf(player2Fields.get(5).getText());
		}
		
		player2Total.setText(Integer.toString(player2TotalScore));
	}
	

}
