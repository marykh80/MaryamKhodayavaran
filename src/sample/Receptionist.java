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

public class Receptionist extends Person{
    private String username;
    private String password;
    private String patientUsername;
    private String patientPassword;
    private String birthdate;
    private String gender;
    private String diseaseType;
    private String historyOfIllness;
    private String drugs;
    private String surgicalOperations;
    private String examinations;

   public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getHistoryOfIllness() {
        return historyOfIllness;
    }

    public void setHistoryOfIllness(String historyOfIllness) {
        this.historyOfIllness = historyOfIllness;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getSurgicalOperations() {
        return surgicalOperations;
    }

    public void setSurgicalOperations(String surgicalOperations) {
        this.surgicalOperations = surgicalOperations;
    }

    public String getExaminations() {
        return examinations;
    }

    public void setExaminations(String examinations) {
        this.examinations = examinations;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", patientFullname='" + patientUsername + '\'' +
                ", patientPassword='" + patientPassword + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", diseaseType='" + diseaseType + '\'' +
                ", historyOfIllness='" + historyOfIllness + '\'' +
                ", drugs='" + drugs + '\'' +
                ", surgicalOperations='" + surgicalOperations + '\'' +
                ", examinations='" + examinations + '\'' +
                '}';
    }

    @FXML
    private Label lblPastor;

    @FXML
    private Tab tabPatient;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblGender;

    @FXML
    private Label lblBirthdate;

    @FXML
    private Label lblDisease;

    @FXML
    private Label lblHistory;

    @FXML
    private TextField txtPatientUsername;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtBirthdate;

    @FXML
    private TextField txtDisease;

    @FXML
    private TextField txtHistory;

    @FXML
    private Button btnAddInfo;

    @FXML
    private Label lblPassword;

    @FXML
    private PasswordField txtPatientPassword;

    @FXML
    private Tab tabInvoice;

    @FXML
    private Label lblDrugs;

    @FXML
    private Label lblSurgical;

    @FXML
    private Label lblExaminations;

    @FXML
    private TextField txtDrugPrice;

    @FXML
    private TextField txtSurgicalPrice;

    @FXML
    private TextField txtExamPrice;

    @FXML
    private Button btnAddPrice;

    @FXML
    void PressBtnAddPrice(ActionEvent event) {

    }

    @FXML
    void pressBtnAddInfo(ActionEvent event) {

    }


    public void pressBtnAddInfo(javafx.event.ActionEvent actionEvent) throws IOException {
        //if(txtPatientUsername.getText().equals("")&&txtPatientPassword.getText().equals("")&&)
        Receptionist receptionist = new Receptionist();
        receptionist.setPatientUsername(txtPatientUsername.getText());
        receptionist.setPatientPassword(txtPatientPassword.getText());
        receptionist.setBirthdate(txtBirthdate.getText());
        receptionist.setGender(txtGender.getText());
        receptionist.setDiseaseType(txtDisease.getText());
        receptionist.setHistoryOfIllness(txtHistory.getText());

        List<Receptionist>list = new ArrayList<>();
        FileManager fileManager = new FileManager();
        list.add(receptionist);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Receptionist.txt");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Added successfully!");
        alert.showAndWait();
        Stage stage = (Stage) btnAddInfo.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Receptionist.fxml"));
        Scene scene = new Scene(root,580,430);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void PressBtnAddPrice(javafx.event.ActionEvent actionEvent) throws IOException {
        Receptionist receptionist = new Receptionist();
        receptionist.setDrugs(txtDrugPrice.getText());
        receptionist.setSurgicalOperations(txtSurgicalPrice.getText());
        receptionist.setExaminations(txtExamPrice.getText());
        List<Receptionist>list = new ArrayList<>();
        FileManager fileManager = new FileManager();
        list.add(receptionist);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Receptionist.txt");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Added successfully!");
        alert.showAndWait();
        Stage stage = (Stage) btnAddPrice.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root,580,430);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
