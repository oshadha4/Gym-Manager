package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class numberPad {
    public static Pane number_pad1(TextField used_txt, Pane paneNumber) {
        Pane number_pad2 = new Pane();
        number_pad2.setPrefHeight(160);
        number_pad2.setPrefWidth(260);
        number_pad2.setLayoutX(350);
        number_pad2.setLayoutY(10);

        Button np1 = new Button("1");
        np1.setLayoutX(195);
        np1.setLayoutY(130);
        np1.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("1");
            }
        });

        Button np2 = new Button("2");
        np2.setLayoutX(255);
        np2.setLayoutY(130);
        np2.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("2");
            }
        });


                Button np3 = new Button("3");
        np3.setLayoutX(315);
        np3.setLayoutY(130);
        np3.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("3");
            }
        });

        Button np4 = new Button("4");
        np4.setLayoutX(195);
        np4.setLayoutY(200);
        np4.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("4");
            }
        });

        Button np5 = new Button("5");
        np5.setLayoutX(255);
        np5.setLayoutY(200);
        np5.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: #ff6347;-fx-alignment: center");
        np5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("5");
            }
        });

        Button np6 = new Button("6");
        np6.setLayoutX(315);
        np6.setLayoutY(200);
        np6.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("6");
            }
        });

        Button np7 = new Button("7");
        np7.setLayoutX(195);
        np7.setLayoutY(270);
        np7.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("7");
            }
        });

        Button np8 = new Button("8");
        np8.setLayoutX(255);
        np8.setLayoutY(270);
        np8.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("8");
            }
        });

        Button np9 = new Button("9");
        np9.setLayoutX(315);
        np9.setLayoutY(270);
        np9.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("9");
            }
        });

        Button np0 = new Button("0");
        np0.setLayoutX(255);
        np0.setLayoutY(340);
        np0.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: tomato;-fx-alignment: center");
        np0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText("0");
            }
        });

        Button npdot = new Button(".");
        npdot.setLayoutX(195);
        npdot.setLayoutY(340);
        npdot.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: cornflowerblue;-fx-alignment: center");
        npdot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.appendText(".");
            }
        });

        Button npclear = new Button("C");
        npclear.setLayoutX(315);
        npclear.setLayoutY(340);
        npclear.setStyle("-fx-font-size: 25;-fx-background-radius: 10;-fx-background-color: cornflowerblue;-fx-alignment: center");
        npclear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                used_txt.setText(used_txt.getText().substring(0, used_txt.getText().length() - 1));
            }
        });

        number_pad2.getChildren().addAll(np0, np1, np2, np3, np4, np5, np6, np7, np8, np9, npdot, npclear);
        return number_pad2;
    }
}



