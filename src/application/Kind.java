package application;

import java.util.ArrayList;


public class Kind {
	
	public static int treOfAKind(ArrayList<Integer> myDiceValue) {
		ArrayList <Integer> dices = myDiceValue;
		
		int sum = 0;

		Boolean ThreeOfAKind = false;

		for (int i = 1; i <= 6; i++) {
			int Count = 0;
			for (int j = 0; j < dices.size(); j++) {
				if (dices.get(j) == i)
					Count++;

				if (Count > 2)
					ThreeOfAKind = true;
			}
		}

		if (ThreeOfAKind) {
			for (int k = 0; k < dices.size(); k++) {
				sum  = dices.get(k)*3;
			}
		}
		
		return sum;
	}

	public static int fourOfAKind(ArrayList<Integer> myDiceValue) {
		ArrayList <Integer> dices = myDiceValue;

		int sum = 0;

		Boolean FourOfAKind = false;

		for (int i = 1; i <= 6; i++) {
			int Count = 0;
			for (int j = 0; j < dices.size(); j++) {
				if (dices.get(j) == i)
					Count++;

				if (Count == 4)
					FourOfAKind = true;
			}
		}

		if (FourOfAKind) {
			for (int k = 0; k < dices.size(); k++) {
				sum = dices.get(k)*4;
			}
		}
		return sum;

	}
}
