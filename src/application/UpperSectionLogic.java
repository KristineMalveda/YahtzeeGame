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
	 int twos = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 2) {
          twos++;         
     }
 }  
     int sum = twos*2;
     return sum;
}
public static int Threes(ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int threes = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 3) {
          threes++;         
     }
 }  
     int sum = threes*3;
     return sum;
}
	
public static int Fours(ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int fours = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 4) {
          fours++;         
     }
 }  
     int sum = fours*4;
     return sum;
}
public static int Fives(ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int fives = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 5) {
          fives++;         
     }
 }  
     int sum = fives*5;
     return sum;
}
public static int Sixes(ArrayList<Integer> myDiceValue) {
	ArrayList <Integer> dices = myDiceValue;  
	 int sixes = 0;    
     for(int i= 0; i < dices.size(); i++) {
         if (dices.get(i) == 6) {
          sixes++;         
     }
 }  
     int sum = sixes*6;
     return sum;
}
	
	
	
	
	
}
