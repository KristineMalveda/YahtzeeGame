package application;

import java.util.ArrayList;

public class UpperSectionLogic {

public static int Aces (ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int aces = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 1) {
          aces++;         
     }
 }  
     int sum = aces;
     return sum;
}

public static int Twos(ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int aces = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 2) {
          aces+=2;         
     }
 }  
     int sum = aces;
     return sum;
}
	
	
	
	
	
	
	
}
