package application;

import java.util.ArrayList;

public class GetTheScores {

 public static  ArrayList <Integer> scorePlayer1 = new ArrayList<Integer>();	
 public static  ArrayList <Integer> scorePlayer2 = new ArrayList<Integer>();
 public static  ArrayList <Integer> scorePlayer1LowerSec = new ArrayList<Integer>();	
 public static  ArrayList <Integer> scorePlayer2LowerSec = new ArrayList<Integer>();	
	
 
 	public static void addOnArrayListPlayer1(int showScore) {
 		scorePlayer1.add(showScore);
 	}
 	public static void addOnArrayListPlayer2(int showScore2) {
 		scorePlayer2.add(showScore2);
 	}
 	
	public static void addOnArrayListPlayer1LowerSec(int showScore) {
 		scorePlayer1LowerSec.add(showScore);
 	}
 	public static void addOnArrayListPlayer2LowerSec(int showScore2) {
 		scorePlayer2LowerSec.add(showScore2);
 	}
 	
	public static int totalScoresPlayer1() {
		
	int total = 0;
	
		for (int i = 0; i < scorePlayer1.size(); i++) {
			total += scorePlayer1.get(i);
		}
		return total;
		
	}
	public static int totalScoresPlayer2() {
		
		int total = 0;
		
		for (int i = 0; i < scorePlayer2.size(); i++) {
			total += scorePlayer2.get(i);
		}
		return total;
		
	}
	public static int totalScoresPlayer1LowerSec() {
		
		int total = 0;
		
			for (int i = 0; i < scorePlayer1LowerSec.size(); i++) {
				total += scorePlayer1LowerSec.get(i);
			}
			return total;
			
		}
		public static int totalScoresPlayer2LowerSec() {		
			int total = 0;
			for (int i = 0; i < scorePlayer2LowerSec.size(); i++) {
				total += scorePlayer2LowerSec.get(i);
			}
			return total;
			
		}
		
		
}
