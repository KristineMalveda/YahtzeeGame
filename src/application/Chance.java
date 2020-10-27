package application;

import java.util.ArrayList;
import java.util.Collections;

public class Chance {
	public static int AddUpChance(ArrayList<Integer> myDiceValue) {
	int sum = 0;
	ArrayList<Integer> dices = myDiceValue;
	Collections.sort(dices);


	  for( int i = 0; i < dices.size(); i++ )
	  {
	    sum += dices.get(i);
	  }

	  return sum;
	}
}
