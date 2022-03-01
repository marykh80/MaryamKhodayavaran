package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person{
    private String username;
    private String password;
    private String diseaseType;
    private String medication;
    private String DateOfSurgery;
    private String roomNumber;
    private String HealthStatus;


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String username) {
        this.password = password;
    }


    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String prescription) {
        this.medication = prescription;
    }

    public String getDateOfSurgery() {
        return DateOfSurgery;
    }

    public void setDateOfSurgery(String dateOfSurgery) {
        DateOfSurgery = dateOfSurgery;
    }

    public String getRoomNumber(String roomNumber) {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getHealthStatus() {
        return HealthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        HealthStatus = healthStatus;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", diseaseType='" + diseaseType + '\'' +
                ", medication='" + medication + '\'' +
                ", DateOfSurgery='" + DateOfSurgery + '\'' +
                ", roomNumber=" + roomNumber +
                ", HealthStatus='" + HealthStatus + '\'' +
                '}';
    }

    @FXML
    private Label lblPastor;

    @FXML
    private Tab tabPrescriptions;

    @FXML
    private Label lblDiseaseType;

    @FXML
    private Label lblMedication;

    @FXML
    private TextField txtDiseaseType;

    @FXML
    private TextField txtMedication;

    @FXML
    private Button btnAddPrescriptions;

    @FXML
    private Tab tabSurgicalOperations;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblPPS;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtPPS;

    @FXML
    private Label lblRoom;

    @FXML
    private TextField txtRoom;

    @FXML
    private Button btnAddSurgicalOperations;

    @FXML
    void pressAddPrescription(ActionEvent event) {

    }

    @FXML
    void pressBtnSurgicalOperations(ActionEvent event) {


    }

    public void pressAddPrescription(javafx.event.ActionEvent actionEvent) throws IOException {
        Doctor doctor = new Doctor();
        doctor.setDiseaseType(txtDiseaseType.getText());
        doctor.setMedication(txtMedication.getText());
        List<Doctor> list = new ArrayList<>();
        FileManager fileManager = new FileManager();
        list.add(doctor);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Doctor.txt");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Added successfully!");
        alert.showAndWait();
        Stage stage = (Stage) btnAddPrescriptions.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Doctor.fxml"));
        Scene scene = new Scene(root,580,430);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void pressBtnSurgicalOperations(javafx.event.ActionEvent actionEvent) throws IOException {
        Doctor doctor = new Doctor();
        doctor.setDateOfSurgery(txtDate.getText());
        doctor.setRoomNumber(txtRoom.getText());
        doctor.setHealthStatus(txtPPS.getText());
        List<Doctor> list = new ArrayList<>();
        FileManager fileManager = new FileManager();
        list.add(doctor);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Doctor.txt");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Added successfully!");
        alert.showAndWait();
        Stage stage = (Stage) btnAddSurgicalOperations.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root,580,430);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

