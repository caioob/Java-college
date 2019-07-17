package task1;
	
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Task1Tester extends Application {
	public void start(Stage primaryStage) {
		RandomNumbers a = new RandomNumbers();
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(4);
		pane.setVgap(4);
		pane.setAlignment(Pos.CENTER);
		
		pane.add(new Label ("The randomly generated numbers are " +a.getFirst() +" and " +a.getSecond()), 0, 0);
		pane.add(new Label ("What's the adition of " +a.getFirst() +" and " +a.getSecond()), 0, 1);
		TextField sum = new TextField();
		pane.add(sum, 1, 1);
		pane.add(new Label ("What's the subtraction of " +a.getFirst() +" and " +a.getSecond()), 0, 2);
		TextField sub = new TextField();
		pane.add(sub, 1, 2);
		pane.add(new Label ("What's the multiplication of " +a.getFirst() +" and " +a.getSecond()), 0, 3);
		TextField mul = new TextField();
		pane.add(mul, 1, 3);
		pane.add(new Label ("What's the division of " +a.getFirst() +" and " +a.getSecond()), 0, 4);
		TextField div = new TextField();
		pane.add(div, 1, 4);
		

		Button submit;
		pane.add(submit = new Button("Submit Result"), 0, 8);
		List<Double> answers = new ArrayList<Double>();
		
		submit.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double sum_ = Double.parseDouble(sum.getText());
				double sub_ = Double.parseDouble(sub.getText());
				double mul_ = Double.parseDouble(mul.getText());
				double div_ = Double.parseDouble(div.getText());
				answers.add(sum_);
				answers.add(sub_);
				answers.add(mul_);
				answers.add(div_);

				
				a.check(answers);
				pane.add(new Label("Number of correct answers: " +a.getCorrect() ), 0, 6);
				pane.add(new Label("Number of wrong answers: " +a.getWrong() ), 0, 7);
				a.reset();
			}
		});
		
		Scene scene = new Scene(pane, 500, 250);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
