//U10416004 顏仲賢
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyCalculator extends Application {
	
  	@Override
  	public void start(Stage primaryStage) {

		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.TOP_CENTER);
		gridpane.setHgap(5);
		gridpane.setVgap(5);

		VBox vbox = new VBox();
		Group group = new Group();
	
		TextField text = new TextField();

    		double[] temporary = {0, 0};

		// Create four function + - * /
    		boolean[] function = new boolean[4];

		// Set initial function is false
    		for(int i = 0; i < 4; i++) {
    			function[0] = false;
    		}

		// Create menu V E H 
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    		Menu menuV = new Menu("(檢視V)");
    		Menu menuE = new Menu("編輯(E)");  
    		Menu menuH = new Menu("說明(H)");
    		menuBar.getMenus().addAll(menuV, menuE, menuH);

    		gridpane.add(text, 1, 6, 5, 5);
    		text.setMinSize(225,60);
    		text.setEditable(false);	// Let the text can not be edited

		// Create a new pane
		Pane pane = new Pane();
		
		// Create button MC
    		Button MC = new Button("MC");
	 	    MC.setMinSize(40, 40);
    		gridpane.add(MC, 1, 12);
    
    	// Create button MR
    		Button MR = new Button("MR");
    		MR.setMinSize(40, 40);
    		gridpane.add(MR, 2, 12);

		// Create button MS
    		Button MS = new Button("MS");
    		MS.setMinSize(40, 40);
    		gridpane.add(MS, 3, 12);

		// Create button M+
    		Button Madd = new Button("M+");
    		Madd.setMinSize(40, 40);
    		gridpane.add(Madd, 4, 12);

		// Create button M-
		    Button Msub = new Button("M-");
		    Msub.setMinSize(40, 40);
    		gridpane.add(Msub, 5, 12);

			
			
			Button Del = new Button("DEL");
			Del.setMinSize(40, 40);
    		gridpane.add(Del, 1, 14);
    		Del.setOnAction(e -> {
    			String result = text.getText();
    			result = result.substring(0, result.length() - 1);
    			text.setText(result);
    		});
    
    	// Create button CE 
			Button CE = new Button("CE");
			CE.setMinSize(40, 40);
    		gridpane.add(CE, 2, 14);
    		CE.setOnAction(e -> {
			text.clear();
    			text.setText("");
    		});
  
  		// Create button C 
			Button C = new Button("C");
			C.setMinSize(40, 40);
    		gridpane.add(C, 3, 14);
    		C.setOnAction(e -> {
    			text.clear();
    			text.setText("");
    		});
    
    	// Create button +/- 
			Button AS = new Button("+/-");
			AS.setMinSize(40, 40);
    		gridpane.add(AS, 4, 14);
    		AS.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText());
    			result = result * (-1);
    			text.setText(Double.toString(result));
    		});
  
  		// Create button sqrt 
			Button bSqrt = new Button("Sqrt");
			bSqrt.setMinSize(40, 40);
    		gridpane.add(bSqrt, 5, 14);
    		bSqrt.setOnAction(e -> {
    			double result = Math.sqrt(Double.parseDouble(text.getText())); 
    			text.setText(Double.toString(result));
    		});
   
   		// Create button seven 
			Button buttonSeven = new Button("7");
			buttonSeven.setMinSize(40, 40);
    		gridpane.add(buttonSeven, 1, 16);
    		buttonSeven.setOnAction(e -> {
        		int num = 7;
        		text.setText(text.getText() + num);
			});
    
    	// Create button eight 
			Button buttonEight = new Button("8");
			buttonEight.setMinSize(40, 40);
    		gridpane.add(buttonEight, 2, 16);
    		buttonEight.setOnAction(e -> {
        		int num = 8;
        		text.setText(text.getText() + num);
    		});
    
		// Create button nine 
			Button buttonNine = new Button("9");
			buttonNine.setMinSize(40, 40);
    		gridpane.add(buttonNine, 3, 16);
    		buttonNine.setOnAction(e -> {
        		int num = 9;
        		text.setText(text.getText() + num);
    		});
    
    	// Create button / 
			Button buttonDivide = new Button("/");
			buttonDivide.setMinSize(40, 40);
    		gridpane.add(buttonDivide, 4, 16);
    		buttonDivide.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("");
    			function[3] = true;
    		});
  
  		// Create button % 
			Button buttonPercent = new Button("%");
			buttonPercent.setMinSize(40, 40);
    		gridpane.add(buttonPercent, 5, 16);
    		buttonPercent.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText()); 
    			result = result / 100;
    			text.setText(Double.toString(result));
    		});
   
   		// Create button four
			Button buttonFour = new Button("4");
			buttonFour.setMinSize(40, 40);
    		gridpane.add(buttonFour, 1, 18);
    		buttonFour.setOnAction(e -> {
        		int num = 4;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button five 
			Button buttonFive = new Button("5");
			buttonFive.setMinSize(40, 40);
    		gridpane.add(buttonFive, 2, 18);
    		buttonFive.setOnAction(e -> {
        		int num = 5;
        		text.setText(text.getText() + num);
    		});
  
  		// Create button six 
			Button buttonSix = new Button("6");
			buttonSix.setMinSize(40, 40);
    		gridpane.add(buttonSix, 3, 18);
    		buttonSix.setOnAction(e -> {
        		int num = 6;
        		text.setText(text.getText() + num);
    		});
  
  		// Create button * 
			Button buttonMultiply = new Button("*");
			buttonMultiply.setMinSize(40, 40);
    		gridpane.add(buttonMultiply, 4, 18);
    		buttonMultiply.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("");
    			function[2] = true;
    		});
  
  		// Create button 1/x 
			Button button1dx = new Button("1/x");
			button1dx.setMinSize(40, 40);
    		gridpane.add(button1dx, 5, 18);
    		button1dx.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText()); 
    			result = 1 / result;
    			text.setText(Double.toString(result));
    		});
    
    	// Create button + 
    		Button buttonAdd = new Button("+");
			buttonAdd.setMinSize(40, 40);
    		gridpane.add(buttonAdd, 4, 21);
    		buttonAdd.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("");
    			function[0] = true;
    		});
   
   		// Create button one 
			Button buttonOne = new Button("1");
			buttonOne.setMinSize(40, 40);
    		gridpane.add(buttonOne, 1, 20);
    		buttonOne.setOnAction(e -> {
        		int num = 1;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button two 
			Button buttonTwo = new Button("2");
			buttonTwo.setMinSize(40, 40);
    		gridpane.add(buttonTwo,2,20);
    		buttonTwo.setOnAction(e -> {
        		int num = 2;
        		text.setText(text.getText() + num);
    		});
    
    	// Create button three 
			Button buttonThree = new Button("3");
			buttonThree.setMinSize(40, 40);
    		gridpane.add(buttonThree, 3, 20);
			buttonThree.setOnAction(e -> {
        		int num = 3;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button - 
			Button buttonSub = new Button("-");
			buttonSub.setMinSize(40, 40);
    		gridpane.add(buttonSub, 4, 20);
    		buttonSub.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("");
    			function[1] = true;
    		});
  
  		// Create button zero 
			Button buttonZero = new Button("0");
			buttonZero.setMinSize(82, 40);
    		gridpane.add(buttonZero, 1, 21, 2, 1);
    		buttonZero.setOnAction(e -> {
        		int num = 0;
        		text.setText(text.getText() + num);
    		});	
 
 		// Create button . 
			Button buttonPoint = new Button(".");
			buttonPoint.setMinSize(40, 40);
    		gridpane.add(buttonPoint, 3, 21);
    		buttonPoint.setOnAction(e -> {
        		String num = ".";
        		text.setText(text.getText() + num);
			});
 
 		// Create button = 
			Button buttonEqual = new Button("=");
			buttonEqual.setMinSize(40, 82);
    		gridpane.add(buttonEqual, 5, 20, 1, 2);
    		buttonEqual.setOnAction(e -> {
    			temporary[1] = Double.parseDouble(text.getText());
   
   			// Calculate the +
    			if(function[0] == true) {
    				double result = temporary[0] + temporary[1];
    				text.setText(Double.toString(result));
    			}
 
 			// Calculate the -
    			if(function[1] == true) {
    				double result = temporary[0] - temporary[1];
    				text.setText(Double.toString(result));
    			}
 
 			// Calculate the *
    			if(function[2] == true) {
    				double result = temporary[0] * temporary[1];
    				text.setText(Double.toString(result));
    			}
  
  			// Calculate the /
    			if(function[3] == true) {
    				double result = temporary[0] / temporary[1];
    				text.setText(Double.toString(result));
    			}
    		});

		HBox hBox = new HBox();
    		hBox.setSpacing(10);
    		hBox.setAlignment(Pos.CENTER);
	
		// height and width
			Scene scene = new Scene(group, 230, 401);
   
   		// add gridpane and menuBar into group
    		group.getChildren().add(gridpane);
    		group.getChildren().add(menuBar);
	
		primaryStage.setTitle("My Calculator");
    		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
    		primaryStage.show(); 
  	}
}
