package application;

import java.util.ArrayList;
import java.util.Collections;

public class SmallStraight {

	public static int smallStraight(ArrayList<Integer> myDiceValue) {
		int sum = 0;
		ArrayList<Integer> dices = myDiceValue;
		Collections.sort(dices);
		System.out.println("clicked Small straight");

		if (((dices.get(0) == 1) && (dices.get(1) == 2) && (dices.get(2) == 3) && (dices.get(3) == 4))
				|| ((dices.get(0) == 2) && (dices.get(1) == 3) && (dices.get(2) == 4) && (dices.get(3) == 5))
				|| ((dices.get(0) == 3) && (dices.get(1) == 4) && (dices.get(2) == 5) && (dices.get(3) == 6))
				|| ((dices.get(1) == 1) && (dices.get(2) == 2) && (dices.get(3) == 3) && (dices.get(4) == 4))
				|| ((dices.get(1) == 2) && (dices.get(2) == 3) && (dices.get(3) == 4) && (dices.get(4) == 5))
				|| ((dices.get(1) == 3) && (dices.get(2) == 4) && (dices.get(3) == 5) && (dices.get(4) == 6))) {
			sum = 30;
		
		}
		return sum;

	}
}
