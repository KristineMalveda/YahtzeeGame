package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class SampleController {
	@FXML
	private ImageView die1, die2, die3, die4, die5;

	@FXML
	private Label lblWarning;
	@FXML
	private TextField acesPlayer1,twosPlayer1,threesPlayer1,foursPlayer1,fivesPlayer1,sixesPlayer1;
	
	@FXML
	private Button spinBtn;

	@FXML
	private Button btnDie1, btnDie2, btnDie3, btnDie4, btnDie5;

	private Image gifs[] = new Image[6];
	{
		gifs[0] = new Image(this.getClass().getResource("/dice/die1.gif").toExternalForm());
		gifs[1] = new Image(this.getClass().getResource("/dice/die2.gif").toExternalForm());
		gifs[2] = new Image(this.getClass().getResource("/dice/die3.gif").toExternalForm());
		gifs[3] = new Image(this.getClass().getResource("/dice/die4.gif").toExternalForm());
		gifs[4] = new Image(this.getClass().getResource("/dice/die5.gif").toExternalForm());
		gifs[5] = new Image(this.getClass().getResource("/dice/die6.gif").toExternalForm());
	}

	private ArrayList<ImageView> imgviewList = new ArrayList<>();
	private ArrayList<Button> myButtons = new ArrayList<>();
	private ArrayList<Integer> myDiceValue = new ArrayList<>();
	int numOfSpin = 0;
	int value = 0;

	@FXML
	private void handleButtonAction(ActionEvent event) {
		numOfSpin++;
		spinTheDice.spinIt(numOfSpin, lblWarning, spinBtn);
		chooseDice();
	}

	@FXML
	private void dice1ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(0).setDisable(true);
		Node node = myButtons.get(0).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		getDiceValue(btnImage);
	}

	@FXML
	private void dice2ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(1).setDisable(true);
		Node node = myButtons.get(1).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		getDiceValue(btnImage);
	}

	@FXML
	private void dice3ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(2).setDisable(true);
		Node node = myButtons.get(2).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		getDiceValue(btnImage);
	}

	@FXML
	private void dice4ButtonEvent(ActionEvent event) {
		imgviewList = updateDie();
		myButtons = myButtons();
		myButtons.get(3).setDisable(true);
		Node node = myButtons.get(3).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		getDiceValue(btnImage);
	}

	@FXML
	private void dice5ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(4).setDisable(true);
		Node node = myButtons.get(4).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		getDiceValue(btnImage);
	}

	
	@FXML 
	private void lblAcesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Aces(myDiceValue);
		if(showScore == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}
	    acesPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	
	@FXML 
	private void lblTwosEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Twos(myDiceValue);
	    twosPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	
	
	@FXML 
	private void lblThreesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Threes(myDiceValue);
	    threesPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	
	
	@FXML 
	private void lblFoursEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Fours(myDiceValue);
	    foursPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	@FXML 
	private void lblFivesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Fives(myDiceValue);
	    fivesPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	
	@FXML 
	private void lblSixesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Sixes(myDiceValue);
	    sixesPlayer1.setText(Integer.toString(showScore));
		System.out.println(myDiceValue);
	}
	
	@FXML
	private ArrayList<ImageView> updateDie() {
		ArrayList<ImageView> list = imgviewList;
		list.add(die1);
		list.add(die2);
		list.add(die3);
		list.add(die4);
		list.add(die5);
		return list;

	}

	@FXML
	private ArrayList<Button> myButtons() {
		ArrayList<Button> buttonList = myButtons;
		buttonList.add(btnDie1);
		buttonList.add(btnDie2);
		buttonList.add(btnDie3);
		buttonList.add(btnDie4);
		buttonList.add(btnDie5);
		return buttonList;

	}

	// Todo: transfer to another class
	@FXML
	private void chooseDice() {
		myButtons = myButtons();
		imgviewList = updateDie();
		for (int i = 0; i < myButtons.size(); i++) {
			if (!myButtons.get(i).isDisable()) {
				Image img = gifs[spinTheDice.shuffleImages(gifs.length)];
				ImageView imgview = new ImageView(img);
				myButtons.get(i).setGraphic(imgview);
				myButtons.get(i).setVisible(true);
			}
		}

	}
	
	private void getDiceValue(Image buttonImg) {
		for (int i = 0; i < gifs.length; i++) {
			if (buttonImg == gifs[i]) {
				value = i + 1;
			
			}
		}
		DiceValue.setValue(value);
		myDiceValue.add(DiceValue.getValue());
	}
	
	

}
