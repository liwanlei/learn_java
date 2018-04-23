package com.fengzhuang;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.converter.PercentageStringConverter;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Text Fonts");
        Group root=new Group();
        Scene scene =new Scene(root, 550, 250,new Color(0,0,1,1.0));
        Text text = new Text(50, 100, "JavaFX 2.0 from Java2s.com");
        Font sanSerif = Font.font("Dialog", 30);
        text.setFont(sanSerif);
        text.setFill(Color.RED);
        root.getChildren().add(text);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}