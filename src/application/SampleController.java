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
	private Label lblWarning, lblPlayer1, lblPlayer2, lblAces, lblTwos, lblThrees, lblFours, lblFives, lblSixes;
	@FXML
	private TextField acesPlayer1, twosPlayer1, threesPlayer1, foursPlayer1, fivesPlayer1, sixesPlayer1, player1Total,
			bonusPlayer1;
	@FXML
	private TextField acesPlayer2, twosPlayer2, threesPlayer2, foursPlayer2, fivesPlayer2, sixesPlayer2, player2Total,
			bonusPlayer2;
	@FXML
	private TextField threeOfAKindPlayer1, fourOfAKindPlayer1, fullhousePlayer1, smStrPlayer1, lgStrPlayer1,
			yahtzeePlayer1, chancePlayer1, lowerTotalPLayer1;
	@FXML
	private TextField threeOfAKindPlayer2, fourOfAKindPlayer2, fullhousePlayer2, smStrPlayer2, lgStrPlayer2,
			yahtzeePlayer2, chancePlayer2, lowerTotalPlayer2;
	@FXML
	private Button btnDie1, btnDie2, btnDie3, btnDie4, btnDie5, spinBtn;

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
	private ArrayList<TextField> player1Fields = new ArrayList<>();
	private ArrayList<TextField> player2Fields = new ArrayList<>();
	private ArrayList<TextField> player1LowerFields = new ArrayList<>();
	private ArrayList<TextField> player2LowerFields = new ArrayList<>();

	private int activePlayer;

	@FXML
	public void initialize() {

		hideButtons();
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);
	}

	@FXML
	private void handleButtonAction(ActionEvent event) {
		myButtons = myButtons();
		SpinTheDice.spinIt(lblWarning, spinBtn, myButtons, gifs);
	}

	@FXML
	private void dice1ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(0).setDisable(true);
		Node node = myButtons.get(0).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		GetTheDiceValue.getDiceValue(btnImage, gifs, activePlayer);
	}

	@FXML
	private void dice2ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(1).setDisable(true);
		Node node = myButtons.get(1).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		GetTheDiceValue.getDiceValue(btnImage, gifs, activePlayer);

	}

	@FXML
	private void dice3ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(2).setDisable(true);
		Node node = myButtons.get(2).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		GetTheDiceValue.getDiceValue(btnImage, gifs, activePlayer);

	}

	@FXML
	private void dice4ButtonEvent(ActionEvent event) {
		imgviewList = updateDie();
		myButtons = myButtons();
		myButtons.get(3).setDisable(true);
		Node node = myButtons.get(3).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		GetTheDiceValue.getDiceValue(btnImage, gifs, activePlayer);

	}

	@FXML
	private void dice5ButtonEvent(ActionEvent event) {
		myButtons = myButtons();
		myButtons.get(4).setDisable(true);
		Node node = myButtons.get(4).getGraphic();
		ImageView img = (ImageView) node;
		Image btnImage = img.getImage();
		GetTheDiceValue.getDiceValue(btnImage, gifs, activePlayer);

	}

	@FXML
	private void lblAcesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Aces(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Aces(GetTheDiceValue.myDiceValue2);
		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();

		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}
		if (activePlayer == 1) {
			if (acesPlayer1.getText().isBlank()) {
				acesPlayer1.setText(Integer.toString(showScore));

				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}

		}

		if (activePlayer == 2) {
			if (acesPlayer2.getText().isBlank()) {
				acesPlayer2.setText(Integer.toString(showScore2));
				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);
	}

	@FXML
	private void lblTwosEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Twos(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Twos(GetTheDiceValue.myDiceValue2);
		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();

		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}
		if (activePlayer == 1) {
			if (twosPlayer1.getText().isBlank()) {
				twosPlayer1.setText(Integer.toString(showScore));
				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (twosPlayer2.getText().isBlank()) {
				twosPlayer2.setText(Integer.toString(showScore2));
				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblThreesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Threes(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Threes(GetTheDiceValue.myDiceValue2);
		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();
		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (threesPlayer1.getText().isBlank()) {
				threesPlayer1.setText(Integer.toString(showScore));
				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (threesPlayer2.getText().isBlank()) {
				threesPlayer2.setText(Integer.toString(showScore2));
				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblFoursEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Fours(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Fours(GetTheDiceValue.myDiceValue2);

		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();
		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (foursPlayer1.getText().isBlank()) {
				foursPlayer1.setText(Integer.toString(showScore));
				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (foursPlayer2.getText().isBlank()) {
				foursPlayer2.setText(Integer.toString(showScore2));
				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblFivesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Fives(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Fives(GetTheDiceValue.myDiceValue2);
		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();
		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (fivesPlayer1.getText().isBlank()) {
				fivesPlayer1.setText(Integer.toString(showScore));
				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (fivesPlayer2.getText().isBlank()) {
				fivesPlayer2.setText(Integer.toString(showScore2));
				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblSixesEvent(MouseEvent event) {
		int showScore = UpperSectionLogic.Sixes(GetTheDiceValue.myDiceValue);
		int showScore2 = UpperSectionLogic.Sixes(GetTheDiceValue.myDiceValue2);
		hideButtons();
		player1Fields = Player1Fields();
		player2Fields = Player2Fields();
		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (sixesPlayer1.getText().isBlank()) {
				sixesPlayer1.setText(Integer.toString(showScore));
				UpperLowerTotalScore.updatePlayer1Score(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (sixesPlayer2.getText().isBlank()) {
				sixesPlayer2.setText(Integer.toString(showScore2));

				UpperLowerTotalScore.updatePlayer2Score(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblThreeKindEvent(MouseEvent event) {
		hideButtons();
		int showScore = Kind.treOfAKind(GetTheDiceValue.myDiceValue);
		int showScore2 = Kind.treOfAKind(GetTheDiceValue.myDiceValue2);
		player1LowerFields = Player1LowerFields();
		player2LowerFields = Player2LowerFields();
		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (threeOfAKindPlayer1.getText().isBlank()) {
				threeOfAKindPlayer1.setText(Integer.toString(showScore));
				// UpperLowerTotalScore.updatePlayer1LowerSectionScore(player1LowerFields,lowerTotalPLayer1);
			}
		}
		if (activePlayer == 2) {
			if (threeOfAKindPlayer2.getText().isBlank()) {
				threeOfAKindPlayer2.setText(Integer.toString(showScore2));
				// UpperLowerTotalScore.updatePlayer2LowerSectionScore(player2LowerFields,lowerTotalPlayer2);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

	}

	@FXML
	private void lblFourKindEvent(MouseEvent event) {
		hideButtons();
		System.out.println("I clicked for of a kind !");
		int showScore = Kind.fourOfAKind(GetTheDiceValue.myDiceValue);
		int showScore2 = Kind.fourOfAKind(GetTheDiceValue.myDiceValue2);

		if (showScore == 0 && showScore2 == 0) {
			lblWarning.setText("Choose another Category!");
			return;
		}

		if (activePlayer == 1) {
			if (fourOfAKindPlayer1.getText().isBlank()) {
				fourOfAKindPlayer1.setText(Integer.toString(showScore));
				//UpperLowerTotalScore.updatePlayer1LowerSectionScore(player1Fields, player1Total);
			}
		}
		if (activePlayer == 2) {
			if (fourOfAKindPlayer2.getText().isBlank()) {
				fourOfAKindPlayer2.setText(Integer.toString(showScore2));
				//UpperLowerTotalScore.updatePlayer2LowerSection(player2Fields, player2Total);
			}
		}
		activePlayer = SpinTheDice.changePlayer(activePlayer, lblPlayer1, lblPlayer2, myButtons, lblWarning, gifs,
				spinBtn);

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

	@FXML
	private ArrayList<TextField> Player1Fields() {
		ArrayList<TextField> player1FieldList = player1Fields;
		player1FieldList.add(acesPlayer1);
		player1FieldList.add(twosPlayer1);
		player1FieldList.add(threesPlayer1);
		player1FieldList.add(foursPlayer1);
		player1FieldList.add(fivesPlayer1);
		player1FieldList.add(sixesPlayer1);
		return player1FieldList;
	}

	@FXML
	private ArrayList<TextField> Player2Fields() {
		ArrayList<TextField> player2FieldList = player2Fields;
		player2FieldList.add(acesPlayer2);
		player2FieldList.add(twosPlayer2);
		player2FieldList.add(threesPlayer2);
		player2FieldList.add(foursPlayer2);
		player2FieldList.add(fivesPlayer2);
		player2FieldList.add(sixesPlayer2);
		return player2FieldList;
	}

	@FXML
	private ArrayList<TextField> Player1LowerFields() {
		ArrayList<TextField> player1LowerFieldList = player1LowerFields;
		player1LowerFieldList.add(threeOfAKindPlayer1);
		player1LowerFieldList.add(fourOfAKindPlayer1);
		player1LowerFieldList.add(fullhousePlayer1);
		player1LowerFieldList.add(smStrPlayer1);
		player1LowerFieldList.add(lgStrPlayer1);
		player1LowerFieldList.add(yahtzeePlayer1);
		player1LowerFieldList.add(chancePlayer1);
		return player1LowerFieldList;
	}

	@FXML
	private ArrayList<TextField> Player2LowerFields() {
		ArrayList<TextField> player2LowerFieldList = player2LowerFields;
		player2LowerFieldList.add(threeOfAKindPlayer2);
		player2LowerFieldList.add(fourOfAKindPlayer2);
		player2LowerFieldList.add(fullhousePlayer2);
		player2LowerFieldList.add(smStrPlayer2);
		player2LowerFieldList.add(lgStrPlayer2);
		player2LowerFieldList.add(yahtzeePlayer2);
		player2LowerFieldList.add(chancePlayer2);
		return player2LowerFieldList;
	}

	@FXML
	private void hideButtons() {
		myButtons = myButtons();
		for (int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).setVisible(false);
		}
	}

}
