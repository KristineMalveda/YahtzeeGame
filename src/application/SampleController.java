package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	@FXML
	private ImageView die1, die2, die3, die4, die5;

	@FXML
	private Label lblWarning;

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
	int numOfSpin = 0;
	int value = 0;


	@FXML
	private void handleButtonAction(ActionEvent event) {
		numOfSpin++;
		event.consume();
		System.out.println("Spin the dices");
		System.out.println(numOfSpin);
		spinTheDice.spinIt(numOfSpin, lblWarning, spinBtn);
		chooseDice();
	}

	@FXML
	private void handleButtonAction1(ActionEvent event) {
		System.out.println(event.toString());
		myButtons = myButtons();
		myButtons.get(0).setDisable(true);

	}

	@FXML
	private void handleButtonAction2(ActionEvent event) {
		System.out.println(event.toString());
		myButtons = myButtons();
		myButtons.get(1).setDisable(true);
	
	}

	@FXML
	private void handleButtonAction3(ActionEvent event) {
		System.out.println(event.toString());
		myButtons = myButtons();
		myButtons.get(2).setDisable(true);

	}

	@FXML
	private void handleButtonAction4(ActionEvent event) {
		System.out.println(event.toString());
		imgviewList = updateDie();
		myButtons = myButtons();
		myButtons.get(3).setDisable(true);

	}

	@FXML
	private void handleButtonAction5(ActionEvent event) {
		System.out.println(event.toString());
		imgviewList = updateDie();
		myButtons = myButtons();
		myButtons.get(4).setDisable(true);
	}

	/*
	 * @FXML private void dieButton1() { imgviewList = updateDie();
	 * imgviewList.get(0).setDisable(true); imgviewList.get(0).setEffect(new
	 * DropShadow());
	 * 
	 * }
	 *//*
		 * private void dieEvent() {
		 * 
		 * imgviewList = updateDie();
		 * 
		 * for ( iterator = 0; iterator < imgviewList.size() - 1; iterator++) {
		 * System.out.println(iterator );
		 * 
		 * 
		 * imgviewList.get(iterator).setOnMouseClicked((event) -> {
		 * 
		 * imgviewList.get(iterator).setDisable(true);
		 * imgviewList.get(iterator).setEffect(new DropShadow());
		 * System.out.println("I clicked this"+event.getTarget().toString());
		 * 
		 * for (int j = 0; j < imgviewList.size() - 1; j++) { if
		 * (imgviewList.get(j).getImage() == gifs[0]) { value = 0 + 1; } else { value =
		 * imgviewList.size() + 1; } DiceValue.setValue(value);
		 * 
		 * System.out.println(DiceValue.getValue()); }
		 * 
		 * 
		 * });
		 * 
		 * imgviewList.get(i).setDisable(true); imgviewList.get(i).setEffect(new
		 * DropShadow());
		 * 
		 * } }
		 */

//	@FXML
//	private void die1Event(MouseEvent e) {
//		e.consume();
//		die1.setDisable(true);
//		die1.setEffect(new DropShadow());
//		
//		imgviewList = updateDie();
//
//		for (int i = 0; i < imgviewList.size()-1; i++) {
//			if (imgviewList.get(i).getImage() == gifs[i]) {
//				value = i + 1;
//			} else {
//				value = imgviewList.size() + 1;
//			}
//
//		}
//
//		DiceValue.setValue(value);
//		System.out.println(DiceValue.getValue());
//		System.out.println("clicked the first dice");
//
//	}
//
	/*
	 * @FXML private void die2Event(MouseEvent e) { e.consume();
	 * die2.setDisable(true); die2.setEffect(new DropShadow());
	 * 
	 * for (int i = 0; i < imgviewList.size() - 1; i++) { if
	 * (imgviewList.get(i).getImage() == gifs[i]) { value = i + 1; } else { value =
	 * imgviewList.size() + 1; }
	 * 
	 * } DiceValue.setValue(value); System.out.println(DiceValue.getValue());
	 * System.out.println("clicked the Second dice");
	 * 
	 * }
	 * 
	 * @FXML private void die3Event(MouseEvent e) { e.consume();
	 * die3.setDisable(true); die3.setEffect(new DropShadow()); for (int i = 0; i <
	 * imgviewList.size() - 1; i++) { if (imgviewList.get(i).getImage() == gifs[i])
	 * { value = i + 1; } else { value = imgviewList.size() + 1; }
	 * 
	 * } DiceValue.setValue(value); System.out.println(DiceValue.getValue());
	 * System.out.println("clicked the Third dice");
	 * 
	 * }
	 * 
	 * @FXML private void die4Event(MouseEvent e) { e.consume();
	 * die4.setDisable(true); die4.setEffect(new DropShadow()); for (int i = 0; i <
	 * imgviewList.size() - 1; i++) { if (imgviewList.get(i).getImage() == gifs[i])
	 * { value = i + 1; } else { value = imgviewList.size() + 1; }
	 * 
	 * } DiceValue.setValue(value); System.out.println(DiceValue.getValue());
	 * System.out.println("clicked the Fourth dice");
	 * 
	 * }
	 * 
	 * @FXML private void die5Event(MouseEvent e) { e.consume();
	 * die5.setDisable(true); die5.setEffect(new DropShadow()); for (int i = 0; i <
	 * imgviewList.size() - 1; i++) { if (imgviewList.get(i).getImage() == gifs[i])
	 * { value = i + 1; } else { value = imgviewList.size() + 1; }
	 * 
	 * } DiceValue.setValue(value); System.out.println(DiceValue.getValue());
	 * System.out.println("clicked the Fifth dice"); }
	 */

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

	

}
