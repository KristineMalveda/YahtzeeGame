package application;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class GetTheDiceValue {
	private static int value = 0;
	public static ArrayList<Integer> myDiceValue = new ArrayList<>();
	public static ArrayList<Integer> myDiceValue2 = new ArrayList<>();
	
	static void getDiceValue(Image buttonImg, Image [] gifs, int activePlayer) {
		for (int i = 0; i < gifs.length; i++) {
			if (buttonImg == gifs[i]) {
				value = i + 1;
			}
		}
		DiceValue.setValue(value);
		if (activePlayer == 1) {
			myDiceValue.add(DiceValue.getValue());
		} else {
			myDiceValue2.add(DiceValue.getValue());
		}
	}

}
