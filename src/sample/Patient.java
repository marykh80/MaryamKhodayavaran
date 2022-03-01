package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    String username;
    String password;

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

    @Override
    public String toString() {
        return "Patient{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @FXML
    private Label lblPastor;

    @FXML
    private Button btnTotalInvoice;

    @FXML
    private Button btnInfoAndStatus;

    @FXML
    private ListView<String> LVTotalInvoice;

    @FXML
    private ListView<String> LVInfoAndStatus;

    @FXML
    void pressBtnInfoAndStatus(ActionEvent event) {

    }

    @FXML
    void pressBtnTotalInvoice(ActionEvent event) {

    }

    public void pressBtnTotalInvoice(javafx.event.ActionEvent actionEvent) {
        LVTotalInvoice.setVisible(true);
        LVInfoAndStatus.setVisible(false);
        FileManager fileManager = new FileManager();
        try {
            fileManager.FileReader("D:\\javafile\\Receptionist.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void pressBtnInfoAndStatus(javafx.event.ActionEvent actionEvent) {
        LVInfoAndStatus.setVisible(true);
        LVTotalInvoice.setVisible(false);
        List<Patient>list = new ArrayList<>();
        FileManager fileManager = new FileManager();


        try {
            fileManager.FileReader("D:\\javafile\\Receptionist.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

