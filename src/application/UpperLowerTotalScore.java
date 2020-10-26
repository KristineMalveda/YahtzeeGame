package application;

import java.util.ArrayList;

import javafx.scene.control.TextField;

public class UpperLowerTotalScore {

	public static int player1TotalScore, player2TotalScore, player1TotalLowerScore,player2TotalLowerScore;
	
	public static void updatePlayer1Score(ArrayList<TextField> player1Fields, TextField player1Total) {
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
	//player1TotalLowerScore += player1TotalScore;
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
		//player2TotalLowerScore += player2TotalScore;
		
		
	}
	
	public static void updatePlayer1LowerSectionScore(ArrayList<TextField> player1LowerFields, TextField player1TotalLower) {
		   player1TotalLowerScore = 0;
	    
	    if (!player1LowerFields.get(0).getText().isBlank()) {
	    	player1TotalLowerScore += Integer.valueOf(player1LowerFields.get(0).getText());
		}
	    
	   
	    player1TotalLowerScore += player1TotalScore;
	    player1TotalLower.setText(Integer.toString(player1TotalLowerScore));
	   // player1Total.setText(Integer.toString(player1TotalLowerScore));
		}
	
	public static void updatePlayer2LowerSectionScore(ArrayList<TextField> player2LowerFields, TextField player2TotalLower) {
		   player2TotalLowerScore = 0;
	    
	    if (!player2LowerFields.get(0).getText().isBlank()) {
	    	player2TotalLowerScore += Integer.valueOf(player2LowerFields.get(0).getText());
		}
	    
	    
	  
	    player2TotalLowerScore += player2TotalScore;
	    player2TotalLower.setText(Integer.toString(player2TotalLowerScore));

		}
	    
	
	
	
	
	
	

}
