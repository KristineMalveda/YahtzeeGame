package application;

import java.util.ArrayList;
import java.util.Collections;

public class Yahtzee {

	public static int calYahtzee(ArrayList<Integer> myDiceValue) {

		int sum = 0;
		ArrayList<Integer> dices = myDiceValue;
		Collections.sort(dices);

		for (int i = 1; i <= 6; i++) {
			int Count = 0;
			for (int j = 0; j < 5; j++) {
				if (dices.get(j) == i)
					Count++;

				if (Count > 4)
					sum = 50;
			}
		}

		return sum;
	}

}
