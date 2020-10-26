package application;

import java.util.ArrayList;
import java.util.Collections;

public class Fullhouse {
	public static int fullHouse(ArrayList<Integer> myDiceValue){
	ArrayList <Integer> dices = myDiceValue; 
		  int sum = 0;

		  Collections.sort(dices);
		      
			  if( (((dices.get(0) == dices.get(1)) && (dices.get(1) == dices.get(2))) && // Three of a Kind
				       (dices.get(3) == dices.get(4)) && // Two of a Kind
				       (dices.get(2) != dices.get(3))) ||
				      ((dices.get(0) == dices.get(1)) && // Two of a Kind
				       (dices.get(2) == dices.get(3)) && (dices.get(3) == dices.get(4))) && // Three of a Kind
				       (dices.get(1) != dices.get(2))) 
				  {	  
		    sum = 25;
		  }

		  return sum;
		}

}
