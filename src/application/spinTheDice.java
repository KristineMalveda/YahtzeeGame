package application;


import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SpinTheDice {
	static int numOfSpin = 0;

	public static int shuffleImages(int length) {
		int i = (int) Math.floor(Math.random() * length);
		return i;
	}

	public static void spinIt(Label lblWarning, Button spinBtn, ArrayList<Button> myButtons, Image[] gifs) {
		numOfSpin++;
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
		chooseDice(myButtons, gifs);
	}
	
	private static void chooseDice(ArrayList<Button> myButtons, Image[] gifs) {
		for (int i = 0; i < myButtons.size(); i++) {
			if (!myButtons.get(i).isDisable()) {
				Image img = gifs[SpinTheDice.shuffleImages(gifs.length)];
				ImageView imgview = new ImageView(img);
				myButtons.get(i).setGraphic(imgview);
				myButtons.get(i).setVisible(true);
			}
		}

	}

	public static int changePlayer(int activePlayer, Label lblPlayer1, 
			Label lblPlayer2, ArrayList<Button> myButtons, Label lblWarning, Image[] gifs, Button spinBtn){
        switch (activePlayer) {
            case 0:
                activePlayer = 1;
                break;
            case 1:
                activePlayer = 2;
                break;
            default:
                activePlayer = 1;
                break;
        }
        
         if(activePlayer == 1){
            lblPlayer1.setDisable(false);
            lblPlayer2.setDisable(true);
        }else{
            lblPlayer2.setDisable(false);
            lblPlayer1.setDisable(true);
        }

         buttonsState(myButtons);
         spinBtn.setDisable(false);
         numOfSpin = 0;
         lblWarning.setText("You have 3 spins to use!");
         return activePlayer;
	}
	
	public static void buttonsState(ArrayList<Button> myButtons) {
		for(int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).setDisable(false);
		}
	}


	public static void clickableDiceButton(Button button) {
		if(button.isDisable()) {
		button.setDisable(false);
		}
}
	
	
	
}
