package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.text.DecimalFormat;


public class Main extends Application {


    Scene Scene1, Scene2, Scene3, Scene4, Scene5, Scene6,Scene7;       // creating scenes
    DecimalFormat dp = new DecimalFormat("0.0");                // creating a variable to use decimal format

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Bank Calculator");           //setting window name to bank calculator

        Image home_Image = new Image("firstImg2.jpg");        //adding background img
        ImageView firstView = new ImageView();
        firstView.setImage(home_Image);
        firstView.setFitWidth(790);
        firstView.setFitHeight(590);
           //adding label home page----------------------------
        Label home_lbl = new Label("Home Page");
        home_lbl.setLayoutX(280);
        home_lbl.setLayoutY(70);
        home_lbl.setStyle("-fx-font-size: 40;-fx-text-alignment: center");
             //adding buttons-----------------------------
        Button btn1 = new Button("Fixed Deposit");
        btn1.setLayoutX(300);
        btn1.setLayoutY(160);
        btn1.setPrefWidth(170);
        btn1.setStyle("-fx-font-size: 20;-fx-text-alignment: center");
        btn1.setOnAction(e -> primaryStage.setScene(Scene2));


        Button btn2 = new Button("Savings");
        btn2.setLayoutX(300);
        btn2.setLayoutY(230);
        btn2.setPrefWidth(170);
        btn2.setStyle("-fx-font-size: 20;-fx-text-alignment: center");
        btn2.setOnAction(e -> primaryStage.setScene(Scene3));

        Button btn3 = new Button("Loan");
        btn3.setLayoutX(300);
        btn3.setLayoutY(300);
        btn3.setPrefWidth(170);
        btn3.setStyle("-fx-font-size: 20");
        btn3.setOnAction(e -> primaryStage.setScene(Scene4));

        Button btn4 = new Button("Mortgage");
        btn4.setLayoutX(300);
        btn4.setLayoutY(375);
        btn4.setPrefWidth(170);
        btn4.setStyle("-fx-font-size: 20");
        btn4.setOnAction(e -> primaryStage.setScene(Scene5));

        Button btn5 = new Button("Help");
        btn5.setLayoutX(70);
        btn5.setLayoutY(500);
        btn5.setPrefWidth(170);
        btn5.setStyle("-fx-font-size: 20");
        btn5.setOnAction(e -> primaryStage.setScene(Scene6));

        Button btn6 = new Button("Exit");
        btn6.setLayoutX(490);
        btn6.setLayoutY(500);
        btn6.setPrefWidth(170);
        btn6.setStyle("-fx-font-size: 20");

//----------------------history btn---------------------------------------------
        Pane path7 = new Pane();
        TextArea hisTxtArea = new TextArea();
        hisTxtArea.setPrefWidth(790);
        hisTxtArea.setPrefHeight(490);


        Button hBack = new Button("Back");           //back button in history window
        hBack.setLayoutX(50);
        hBack.setLayoutY(550);
        hBack.setPrefWidth(150);
        hBack.setOnAction(e-> primaryStage.setScene(Scene1));

        path7.getChildren().addAll(hisTxtArea,hBack);
        Scene7 = new Scene(path7,790,590);
        primaryStage.setScene(Scene7);
        primaryStage.show();
//-------------------------------------------------------------------------

        Button btn7 = new Button("History");
        btn7.setLayoutX(285);
        btn7.setLayoutY(500);
        btn7.setPrefWidth(170);
        btn7.setStyle("-fx-font-size: 20");
        btn7.setOnAction(e-> {                     //setting action to history button
            primaryStage.setScene(Scene7);
            readHistory(hisTxtArea);
        });




        Pane path1 = new Pane();
        path1.getChildren().addAll(firstView, home_lbl, btn1, btn2, btn3, btn4, btn5, btn6, btn7);
        Scene1 = new Scene(path1, 790, 590);
        primaryStage.setScene(Scene1);
        primaryStage.show();
        //home page end ---------------------------------------------------------------------


        Image fdImg = new Image("fdImg1.jpg");            //adding background img
        ImageView fdView1 = new ImageView();
        fdView1.setImage(fdImg);
        fdView1.setFitWidth(790);
        fdView1.setFitHeight(590);

             //adiing labels----------------------------------------------
        Label fdLbl = new Label("Fixed Deposit");
        fdLbl.setLayoutX(280);
        fdLbl.setLayoutY(70);
        fdLbl.setStyle(("-fx-font-size: 37;-fx-text-alignment: center"));


        Label fdLbl1 = new Label("Principle Amount");
        fdLbl1.setLayoutX(50);
        fdLbl1.setLayoutY(160);
        fdLbl1.setPrefWidth(170);
        fdLbl1.setStyle("-fx-font-size: 20");


        Label fdLbl2 = new Label("Interest Rate");
        fdLbl2.setLayoutX(50);
        fdLbl2.setLayoutY(230);
        fdLbl2.setPrefWidth(170);
        fdLbl2.setStyle("-fx-font-size: 20");


        Label fdLbl3 = new Label("Number of Months");
        fdLbl3.setLayoutX(50);
        fdLbl3.setLayoutY(300);
        fdLbl3.setPrefWidth(170);
        fdLbl3.setStyle(("-fx-font-size: 20"));


        Label fdLbl4 = new Label("Future Value");
        fdLbl4.setLayoutX(50);
        fdLbl4.setLayoutY(375);
        fdLbl4.setPrefWidth(170);
        fdLbl4.setStyle(("-fx-font-size: 20"));

            //adding text fields-------------------------------
        TextField fdtxt1 = new TextField("");
        fdtxt1.setLayoutX(300);
        fdtxt1.setLayoutY(160);
        fdtxt1.setPrefWidth(190);


        TextField fdtxt2 = new TextField("");
        fdtxt2.setLayoutX(300);
        fdtxt2.setLayoutY(230);
        fdtxt2.setPrefWidth(190);


        TextField fdtxt3 = new TextField("");
        fdtxt3.setLayoutX(300);
        fdtxt3.setLayoutY(300);
        fdtxt3.setPrefWidth(190);


        TextField fdtxt4 = new TextField("");
        fdtxt4.setLayoutX(300);
        fdtxt4.setLayoutY(370);
        fdtxt4.setPrefWidth(190);

           //adding buttons-----------------------------
        Button fdbtn1 = new Button("Back");
        fdbtn1.setLayoutX(50);
        fdbtn1.setLayoutY(550);
        fdbtn1.setPrefWidth(150);
        fdbtn1.setOnAction(e -> primaryStage.setScene(Scene1));


        Button fdbtn2 = new Button("Calculate");
        fdbtn2.setLayoutX(590);
        fdbtn2.setLayoutY(550);
        fdbtn2.setPrefWidth(150);
        fdbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double PA = Double.parseDouble(fdtxt1.getText());        //Principle amount
                double IR = Double.parseDouble(fdtxt2.getText()) / 100;    //Interest rate
                double NM = Double.parseDouble(fdtxt3.getText()) / 12;     // No of Months
                double FV = PA * (Math.pow(1 + IR / 12, 12 * NM));        //Future Value
                fdtxt4.setText(dp.format(FV));     //Final answer
                historyAdd(fdtxt1,fdtxt2,fdtxt3,fdtxt4,"Principal Amount","Interest Rate","Number of Months","Future Value","Fixed Deposit");
            }
        });


        Pane path2 = new Pane();
        fdtxt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path2.getChildren().addAll(numberPad.number_pad1(fdtxt1, path2));
            }
        });
        fdtxt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path2.getChildren().addAll(numberPad.number_pad1(fdtxt2, path2));
            }
        });
        fdtxt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path2.getChildren().addAll(numberPad.number_pad1(fdtxt3, path2));
            }
        });
        fdtxt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path2.getChildren().addAll(numberPad.number_pad1(fdtxt4, path2));
            }
        });


        path2.getChildren().addAll(fdView1, fdLbl, fdLbl1, fdLbl2, fdLbl3, fdLbl4, fdtxt1, fdtxt2, fdtxt3, fdtxt4, fdbtn1, fdbtn2);
        Scene2 = new Scene(path2, 790, 590);

        //----------------------------end of fix deposit window---------------------------------------------------------------------------------


        Image savImg = new Image("sav1.jfif");       //adding background img
        ImageView sav_view = new ImageView();
        sav_view.setImage(savImg);
        sav_view.setFitWidth(790);
        sav_view.setFitHeight(590);

            //adding labels-----------------------------------
        Label sav_lbl1 = new Label("Savings");
        sav_lbl1.setLayoutX(280);
        sav_lbl1.setLayoutY(70);
        sav_lbl1.setStyle(("-fx-font-size: 37;-fx-text-alignment: center"));

        Label sav_lbl2 = new Label("Principle Amount");
        sav_lbl2.setLayoutX(50);
        sav_lbl2.setLayoutY(160);
        sav_lbl2.setPrefWidth(170);
        sav_lbl2.setStyle("-fx-font-size: 20");


        Label sav_lbl3 = new Label("Interest Rate");
        sav_lbl3.setLayoutX(50);
        sav_lbl3.setLayoutY(230);
        sav_lbl3.setPrefWidth(170);
        sav_lbl3.setStyle("-fx-font-size: 20");


        Label sav_lbl4 = new Label("Number of Months");
        sav_lbl4.setLayoutX(50);
        sav_lbl4.setLayoutY(300);
        sav_lbl4.setPrefWidth(170);
        sav_lbl4.setStyle(("-fx-font-size: 20"));


        Label savlbl5 = new Label("Monthly Payment");
        savlbl5.setLayoutX(50);
        savlbl5.setLayoutY(375);
        savlbl5.setPrefWidth(170);
        savlbl5.setStyle(("-fx-font-size: 20"));

        Label savlbl6 = new Label("Future Value");
        savlbl6.setLayoutX(50);
        savlbl6.setLayoutY(430);
        savlbl6.prefWidth(170);
        savlbl6.setStyle(("-fx-font-size: 20"));


                  //adding text fields----------------------------
        TextField savtxt1 = new TextField("");
        savtxt1.setLayoutX(300);
        savtxt1.setLayoutY(160);
        savtxt1.setPrefWidth(190);


        TextField savtxt2 = new TextField("");
        savtxt2.setLayoutX(300);
        savtxt2.setLayoutY(230);
        savtxt2.setPrefWidth(190);


        TextField savtxt3 = new TextField("");
        savtxt3.setLayoutX(300);
        savtxt3.setLayoutY(300);
        savtxt3.setPrefWidth(190);


        TextField savtxt4 = new TextField("");
        savtxt4.setLayoutX(300);
        savtxt4.setLayoutY(370);
        savtxt4.setPrefWidth(190);


        TextField savtxt5 = new TextField("");
        savtxt5.setLayoutX(300);
        savtxt5.setLayoutY(430);
        savtxt5.setPrefWidth(190);

             //adding buttons-----------------------------------
        Button savbtn1 = new Button("Back");
        savbtn1.setLayoutX(50);
        savbtn1.setLayoutY(550);
        savbtn1.setPrefWidth(150);
        savbtn1.setOnAction(e -> primaryStage.setScene(Scene1));


        Button savbtn2 = new Button("Calculate");
        savbtn2.setLayoutX(590);
        savbtn2.setLayoutY(550);
        savbtn2.setPrefWidth(150);
        savbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double PA = Double.parseDouble(savtxt1.getText());     //principal Amount
                double IR = Double.parseDouble(savtxt2.getText()) / 100; //Interest Rate
                double NM = Double.parseDouble(savtxt3.getText()) / 12;  //Number Of Months
                double MP = Double.parseDouble(savtxt4.getText());     //Monthly Payment
                double FV1 = MP * (((Math.pow(1 + IR / 12, 12 * NM)) - 1) / (IR / 12));
                double FV2 = (IR / 12) + PA * (Math.pow(1 + IR / 12, 12 * NM));
                double FV3 = FV1 + FV2;
                savtxt5.setText(dp.format(FV3));               //final answer
                historyAdd1(savtxt1,savtxt2,savtxt3,savtxt4,savtxt5,"Principal Amount","Interest Rate","Number of Months","Monthly Payment","Future Value","Savings");
            }
        });


        Pane path3 = new Pane();
        savtxt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path3.getChildren().addAll(numberPad.number_pad1(savtxt1, path3));
            }
        });
        savtxt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path3.getChildren().addAll(numberPad.number_pad1(savtxt2, path3));
            }
        });
        savtxt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path3.getChildren().addAll(numberPad.number_pad1(savtxt3, path3));
            }
        });
        savtxt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path3.getChildren().addAll(numberPad.number_pad1(savtxt4, path3));
            }
        });
        savtxt5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path3.getChildren().addAll(numberPad.number_pad1(savtxt5, path3));
            }
        });


        path3.getChildren().addAll(sav_view, sav_lbl1, sav_lbl2, sav_lbl3, sav_lbl4, savlbl5, savlbl6, savtxt1, savtxt2, savtxt3, savtxt4, savtxt5, savbtn1, savbtn2);
        Scene3 = new Scene(path3, 790, 590);
        // end of saving window---------------------------------------------------------------------


        Image loanImg = new Image("loan1.png");                   //adding background img
        ImageView loan_view = new ImageView();
        loan_view.setImage(loanImg);
        loan_view.setFitWidth(790);
        loan_view.setFitHeight(590);

            //adding labels----------------------------------
        Label loanlbl1 = new Label("Loan");
        loanlbl1.setLayoutX(280);
        loanlbl1.setLayoutY(70);
        loanlbl1.setStyle(("-fx-font-size: 37;-fx-text-alignment: center"));

        Label loanlbl2 = new Label("Principle Amount");
        loanlbl2.setLayoutX(50);
        loanlbl2.setLayoutY(160);
        loanlbl2.setPrefWidth(170);
        loanlbl2.setStyle("-fx-font-size: 20");


        Label loanlbl3 = new Label("Interest Rate");
        loanlbl3.setLayoutX(50);
        loanlbl3.setLayoutY(230);
        loanlbl3.setPrefWidth(170);
        loanlbl3.setStyle("-fx-font-size: 20");


        Label loanlbl4 = new Label("Monthly Payment");
        loanlbl4.setLayoutX(50);
        loanlbl4.setLayoutY(300);
        loanlbl4.setPrefWidth(170);
        loanlbl4.setStyle(("-fx-font-size: 20"));


        Label loanlbl5 = new Label("Number of Months");
        loanlbl5.setLayoutX(50);
        loanlbl5.setLayoutY(375);
        loanlbl5.setPrefWidth(170);
        loanlbl5.setStyle(("-fx-font-size: 20"));


               //adding text fields---------------------------
        TextField loantxt1 = new TextField("");
        loantxt1.setLayoutX(300);
        loantxt1.setLayoutY(160);
        loantxt1.setPrefWidth(190);


        TextField loantxt2 = new TextField("");
        loantxt2.setLayoutX(300);
        loantxt2.setLayoutY(230);
        loantxt2.setPrefWidth(190);


        TextField loantxt3 = new TextField("");
        loantxt3.setLayoutX(300);
        loantxt3.setLayoutY(300);
        loantxt3.setPrefWidth(190);


        TextField loantxt4 = new TextField("");
        loantxt4.setLayoutX(300);
        loantxt4.setLayoutY(370);
        loantxt4.setPrefWidth(190);

             //adding buttons--------------------------------
        Button loanbtn1 = new Button("Back");
        loanbtn1.setLayoutX(50);
        loanbtn1.setLayoutY(550);
        loanbtn1.setPrefWidth(150);
        loanbtn1.setOnAction(e -> primaryStage.setScene(Scene1));


        Button loanbtn2 = new Button("Calculate");
        loanbtn2.setLayoutX(590);
        loanbtn2.setLayoutY(550);
        loanbtn2.setPrefWidth(150);
        loanbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double PA = Double.parseDouble(loantxt1.getText());
                double IR = Double.parseDouble(loantxt2.getText()) / 100;
                double NM = Double.parseDouble(loantxt4.getText()) / 12;

                double x = Math.pow(1 + (IR / 12), (NM * 12)) * (PA * (IR / 12));
                double x1 = Math.pow(1 + (IR / 12), (NM * 12)) - 1;
                double x2 = x / x1;
                double MP = (x2 * 100) / 100;
                loantxt3.setText(dp.format(MP));
                historyAdd(loantxt1,loantxt2,loantxt3,loantxt4,"Principal Amount","Interest Rate","Monthly Payment","number of Months","Loan");
            }
        });


        Pane path4 = new Pane();
        loantxt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path4.getChildren().addAll(numberPad.number_pad1(loantxt1, path4));
            }
        });
        loantxt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path4.getChildren().addAll(numberPad.number_pad1(loantxt2, path4));
            }
        });
        loantxt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path4.getChildren().addAll(numberPad.number_pad1(loantxt3, path4));
            }
        });
        loantxt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path4.getChildren().addAll(numberPad.number_pad1(loantxt4, path4));
            }
        });
        path4.getChildren().addAll(loan_view, loanlbl1, loanlbl2, loanlbl3, loanlbl4, loanlbl5, loantxt1, loantxt2, loantxt3, loantxt4, loanbtn1, loanbtn2);
        Scene4 = new Scene(path4, 790, 590);
        //-----------------end of loan window------------------------------------------------------------------------------


        Image morImg = new Image("mor1.png");              //adding background img
        ImageView mor_view = new ImageView();
        mor_view.setImage(morImg);
        mor_view.setFitWidth(790);
        mor_view.setFitHeight(590);

             //creating labels------------------------
        Label morlbl1 = new Label("Mortgage");
        morlbl1.setLayoutX(280);
        morlbl1.setLayoutY(70);
        morlbl1.setStyle(("-fx-font-size: 37;-fx-text-alignment: center"));

        Label morlbl2 = new Label("Principle Amount");
        morlbl2.setLayoutX(50);
        morlbl2.setLayoutY(160);
        morlbl2.setPrefWidth(170);
        morlbl2.setStyle("-fx-font-size: 20");


        Label morlbl3 = new Label("Down Payment");
        morlbl3.setLayoutX(50);
        morlbl3.setLayoutY(230);
        morlbl3.setPrefWidth(170);
        morlbl3.setStyle("-fx-font-size: 20");


        Label morlbl4 = new Label("Interest Rate");
        morlbl4.setLayoutX(50);
        morlbl4.setLayoutY(300);
        morlbl4.setPrefWidth(170);
        morlbl4.setStyle(("-fx-font-size: 20"));


        Label morlbl5 = new Label("Number of Months");
        morlbl5.setLayoutX(50);
        morlbl5.setLayoutY(370);
        morlbl5.setPrefWidth(170);
        morlbl5.setStyle(("-fx-font-size: 20"));

        Label morlbl6 = new Label("Monthly Payment");
        morlbl6.setLayoutX(50);
        morlbl6.setLayoutY(430);
        morlbl6.setPrefWidth(170);
        morlbl6.setStyle(("-fx-font-size: 20"));


       //creating text fields--------------------
        TextField mortxt1 = new TextField("");
        mortxt1.setLayoutX(300);
        mortxt1.setLayoutY(160);
        mortxt1.setPrefWidth(190);


        TextField mortxt2 = new TextField("");
        mortxt2.setLayoutX(300);
        mortxt2.setLayoutY(230);
        mortxt2.setPrefWidth(190);


        TextField mortxt3 = new TextField("");
        mortxt3.setLayoutX(300);
        mortxt3.setLayoutY(300);
        mortxt3.setPrefWidth(190);


        TextField mortxt4 = new TextField("");
        mortxt4.setLayoutX(300);
        mortxt4.setLayoutY(370);
        mortxt4.setPrefWidth(190);

        TextField mortxt5 = new TextField("");
        mortxt5.setLayoutX(300);
        mortxt5.setLayoutY(430);
        mortxt5.setPrefWidth(190);

           //adding buttons----------------------------
        Button morbtn1 = new Button("Back");
        morbtn1.setLayoutX(50);
        morbtn1.setLayoutY(550);
        morbtn1.setPrefWidth(150);
        morbtn1.setOnAction(e -> primaryStage.setScene(Scene1));


        Button morbtn2 = new Button("Calculate");
        morbtn2.setLayoutX(590);
        morbtn2.setLayoutY(550);
        morbtn2.setPrefWidth(150);
        morbtn2.setOnAction(new EventHandler<ActionEvent>() {             //setting action to calculatte button
            @Override
            public void handle(ActionEvent event) {
                double PA = Double.parseDouble(mortxt1.getText());   //Principal Amount
                double DP = Double.parseDouble(mortxt2.getText());   //Down Payment
                double IR = Double.parseDouble(mortxt3.getText()) / 100; //Interest Rate
                double NM = Double.parseDouble(mortxt4.getText()) / 12;  //Number of Months
                double MP = ((PA - DP) * (IR / 12) * Math.pow(1 + (IR / 12), 12 * NM)) / (Math.pow(1 + (IR / 12), 12 * NM) - 1);       //formula
                mortxt5.setText(dp.format(MP));                            //final answer
                historyAdd1(mortxt1,mortxt2,mortxt3,mortxt4,mortxt5,"Principle Amount","Down Payment","Interest Rate","Number of Months","Monthly payment","Mortgage");
            }
        });


        Pane path5 = new Pane();
        mortxt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path5.getChildren().addAll(numberPad.number_pad1(mortxt1, path5));
            }
        });
        mortxt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path5.getChildren().addAll(numberPad.number_pad1(mortxt2, path5));
            }
        });
        mortxt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path5.getChildren().addAll(numberPad.number_pad1(mortxt3, path5));
            }
        });
        mortxt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path5.getChildren().addAll(numberPad.number_pad1(mortxt4, path5));
            }
        });
        mortxt5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                path5.getChildren().addAll(numberPad.number_pad1(mortxt5, path5));
            }
        });
        path5.getChildren().addAll(mor_view, morlbl1, morlbl2, morlbl3, morlbl4, morlbl5, morlbl6, mortxt1, mortxt2, mortxt3, mortxt4, mortxt5, morbtn1, morbtn2);
        Scene5 = new Scene(path5, 790, 590);
        // end of mortgage window-------------------------------------------------------------------


        Image helpImg = new Image("help1.png");           //setiing img
        ImageView help_view = new ImageView();
        help_view.setImage(helpImg);
        help_view.setFitWidth(790);
        help_view.setFitHeight(590);

        Label helplbl1 = new Label("Help");
        helplbl1.setLayoutX(280);
        helplbl1.setLayoutY(70);
        helplbl1.setStyle(("-fx-font-size: 37;-fx-text-alignment: center"));



        Button help_btn1 = new Button("Back");
        help_btn1.setLayoutX(50);
        help_btn1.setLayoutY(550);
        help_btn1.setPrefWidth(150);
        help_btn1.setOnAction(e -> primaryStage.setScene(Scene1));


        Pane path6 = new Pane();
        path6.getChildren().addAll(help_view, help_btn1, helplbl1);
        Scene6 = new Scene(path6, 790, 590);

        //------------------------------------------------------------------------------------//

        btn6.setOnAction(new EventHandler<ActionEvent>() {                 //exit button
            @Override
            public void handle(javafx.event.ActionEvent event) {
                Stage stage = (Stage) btn6.getScene().getWindow();

                stage.close();
            }

        });

    }

    //4 textfield file
        public void historyAdd(TextField txt1, TextField txt2, TextField txt3, TextField txt4, String str1, String
        str2, String str3, String str4, String str5)
        {
            File newFile = new File("History.txt");
            PrintWriter prnWri;
            FileWriter fileWri;
            try {
                fileWri = new FileWriter(newFile, true);
                prnWri = new PrintWriter(fileWri, true);


                prnWri.println(str5);
                prnWri.println(str1 + "=" + txt1.getText());
                prnWri.println(str2 + "=" + txt2.getText());
                prnWri.println(str3 + "=" + txt3.getText());
                prnWri.println(str4 + "=" + txt4.getText());
                prnWri.println("------------------------------");
                prnWri.close();

            } catch (IOException e) {
                System.out.println("error");
            }

        }
    // 5 Textfield file
    public void historyAdd1(TextField txt1 , TextField txt2, TextField txt3, TextField txt4, TextField txt5, String str1, String str2, String str3, String str4, String str5, String str6){
        File file=new File("History.txt");
        PrintWriter prnWri;
        FileWriter fileWri;
        try{
            fileWri=new FileWriter(file,true);
            prnWri=new PrintWriter(fileWri,true);

            prnWri.println(str6);
            prnWri.println(str1+"="+txt1.getText());
            prnWri.println(str2+"="+txt2.getText());
            prnWri.println(str3+"="+txt3.getText());
            prnWri.println(str4+"="+txt4.getText());
            prnWri.println(str5+"="+txt5.getText());
            prnWri.println("------------------------------");
            prnWri.close();

        }catch (IOException e){
            System.out.println("error");
        }
    }
    //show in history window
    public void readHistory(TextArea a1){

        try{
            FileReader fileReader=new FileReader("History.txt");
            BufferedReader bufferedReader= new BufferedReader(fileReader);

            String strn;
            while ((strn=bufferedReader.readLine())!=null){
                String o=a1.getText();

                a1.setText(o+strn+"\n");
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("file not found");
        }

    }
}