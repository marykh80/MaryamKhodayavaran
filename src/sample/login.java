package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class login {


    @FXML
    private Label lblWelcome;

    @FXML
    private Label lblLogin;

    @FXML
    private RadioButton btnReceptionist;

    @FXML
    private RadioButton btnDoctor;

    @FXML
    private RadioButton btnNurse;

    @FXML
    private RadioButton btnPatient;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnDone;

    @FXML
    public void pressBtnDone(javafx.event.ActionEvent actionEvent) throws IOException {
        boolean value = false;
        if(btnReceptionist.isSelected()==false && btnDoctor.isSelected()==false && btnNurse.isSelected()==false && btnPatient.isSelected()==false||txtUsername.getText().equals("") || txtPassword.getText().equals(""))
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Please complete all the parts!");
            alert.showAndWait();
        }
        else{
            if(btnReceptionist.isSelected()){


                if(txtUsername.getText().equals("MaryamAhmadi")&&txtPassword.getText().equals("123")){
                    value = true;
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information Dialog");
                    alert2.setContentText("Welcome!");
                    alert2.showAndWait();
                    Stage stage = (Stage) btnDone.getScene().getWindow();
                    stage.close();
                    Stage primaryStage = new Stage();
                    AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Receptionist.fxml"));
                    Scene scene = new Scene(root,580,430);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }
                 if(!value){
                    Alert alert3 = new Alert(Alert.AlertType.WARNING);
                    alert3.setTitle("Warning Dialog");
                    alert3.setHeaderText(null);
                    alert3.setContentText("Username or Password is wrong!");
                    alert3.showAndWait();
                    txtUsername.setText("");
                    txtPassword.setText("");
                }

            }
            if(btnDoctor.isSelected()){
                if(txtUsername.getText().equals("AmirFazel")&&txtPassword.getText().equals("456")){
                    value = true;
                    Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
                    alert4.setTitle("Information Dialog");
                    alert4.setContentText("Welcome!");
                    alert4.showAndWait();
                    Stage stage = (Stage) btnDone.getScene().getWindow();
                    stage.close();
                    Stage primaryStage = new Stage();
                    AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Doctor.fxml"));
                    Scene scene = new Scene(root,580,430);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }
                if(!value){
                    Alert alert5 = new Alert(Alert.AlertType.WARNING);
                    alert5.setTitle("Warning Dialog");
                    alert5.setHeaderText(null);
                    alert5.setContentText("Username or Password is wrong!");
                    alert5.showAndWait();
                    txtUsername.setText("");
                    txtPassword.setText("");
                }

            }
            if(btnNurse.isSelected()){
                if(txtUsername.getText().equals("MahdiSharifnia")&&txtPassword.getText().equals("789")){
                    value = true;
                    Alert alert6 = new Alert(Alert.AlertType.INFORMATION);
                    alert6.setTitle("Information Dialog");
                    alert6.setContentText("Welcome!");
                    alert6.showAndWait();
                    Stage stage = (Stage) btnDone.getScene().getWindow();
                    stage.close();
                    Stage primaryStage = new Stage();
                    AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Nurse.fxml"));
                    Scene scene = new Scene(root,580,430);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }
                if(!value){
                    Alert alert7 = new Alert(Alert.AlertType.WARNING);
                    alert7.setTitle("Warning Dialog");
                    alert7.setHeaderText(null);
                    alert7.setContentText("Username or Password is wrong!");
                    alert7.showAndWait();
                    txtUsername.setText("");
                    txtPassword.setText("");

                }
                if(btnPatient.isSelected()){
                    if(txtUsername.getText().equals("SobhanNajafi")&&txtPassword.getText().equals("321")){
                        value = true;
                        Alert alert8 = new Alert(Alert.AlertType.INFORMATION);
                        alert8.setTitle("Information Dialog");
                        alert8.setContentText("Welcome!");
                        alert8.showAndWait();
                        Stage stage = (Stage) btnDone.getScene().getWindow();
                        stage.close();
                        Stage primaryStage = new Stage();
                        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Patient.fxml"));
                        Scene scene = new Scene(root,580,430);
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                    if(!value){
                        Alert alert9 = new Alert(Alert.AlertType.WARNING);
                        alert9.setTitle("Warning Dialog");
                        alert9.setHeaderText(null);
                        alert9.setContentText("Username or Password is wrong!");
                        alert9.showAndWait();
                        txtUsername.setText("");
                        txtPassword.setText("");
                    }


                }


            }


        }

    }
    }



