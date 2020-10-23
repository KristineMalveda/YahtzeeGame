package application;


import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class spinTheDice {
	
	public static int shuffleImages(int length) {
		int i = (int) Math.floor(Math.random() * length);
		return i;
	}

	public static void spinIt(int numOfSpin, Label lblWarning, Button spinBtn) {
		if (numOfSpin >= 3) {	
			lblWarning.setText("You must choose a category");
		}

		if (numOfSpin == 1) {
			lblWarning.setText("Two spin left!");
		} else if (numOfSpin == 2) {
			lblWarning.setText("One spin left!");
		} else {
			
			lblWarning.setText("You must choose a category");
			spinBtn.setDisable(true);					
		}
		
	}


	

	
	
	
}
