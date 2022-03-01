package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nurse extends Person {
    private String username;
    private String password;
    private LocalDate channelDate;
    private String  roomNumber;
    private String drugs;
    private String patientHealthStatus;

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
    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getChannelDate() {
        return channelDate;
    }

    public void setChannelDate(LocalDate channelDate) {
        this.channelDate = channelDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getPatientHealthStatus() {
        return patientHealthStatus;
    }

    public void setPatientHealthStatus(String patientHealthStatus) {
        this.patientHealthStatus = patientHealthStatus;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", channelDate='" + channelDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", drugs='" + drugs + '\'' +
                ", patientHealthStatus='" + patientHealthStatus + '\'' +
                '}';
    }

    @FXML
    private Label lblPastor;

    @FXML
    private Label lblCreateChannel;

    @FXML
    private Label lblChannelDate;

    @FXML
    private Label lblRoomNo;

    @FXML
    private DatePicker txtChannelDate;

    @FXML
    private TextField txtRoomNo;

    @FXML
    private Label lblPrescribedDrugs;

    @FXML
    private TextField txtPrescribedDrugs;

    @FXML
    private Button btnAddChannel;

    @FXML
    private Label lblPatientHealthStatus;

    @FXML
    private TextField txtPatientHealthStatus;

    @FXML
    void pressBtnAddChannel(ActionEvent event) {



    }

    public void pressBtnAddChannel(javafx.event.ActionEvent actionEvent) throws IOException {
        Nurse nurse = new Nurse();
        nurse.setChannelDate(txtChannelDate.getValue());
        nurse.setDrugs(txtPrescribedDrugs.getText());
        nurse.setRoomNumber(txtRoomNo.getText());
        nurse.setPatientHealthStatus(txtPatientHealthStatus.getText());
        List<Nurse> list = new ArrayList<>();
        FileManager fileManager = new FileManager();
        list.add(nurse);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Nurse.txt");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Added successfully!");
        alert.showAndWait();
        Stage stage = (Stage) btnAddChannel.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root,580,430);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

