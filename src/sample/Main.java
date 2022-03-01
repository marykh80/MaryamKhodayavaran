package sample;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        List<Receptionist>list = new ArrayList<>();
        List<Doctor>list1 = new ArrayList<>();
        List<Nurse>list2 = new ArrayList<>();
        List<Patient>list3 = new ArrayList<>();

        FileManager fileManager = new FileManager();
        Receptionist receptionist = new Receptionist();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Patient patient = new Patient();

        receptionist.setUsername("MaryamAhmadi");
        receptionist.setPassword("123");
        doctor.setUsername("AmirFazel");
        doctor.setPassword("456");
        nurse.setUsername("MahdiSharifnia");
        nurse.setPassword("789");
        patient.setUsername("SobhanNajafi");
        patient.setPassword("321");



        list.add(receptionist);
        fileManager.fileWriter(list.toString(),"D:\\javafile\\Receptionist.txt");
        list1.add(doctor);
        fileManager.fileWriter(list1.toString(),"D:\\javafile\\Doctor.txt");
        list2.add(nurse);
        fileManager.fileWriter(list2.toString(),"D:\\javafile\\Nurse.txt");
        list3.add(patient);
        fileManager.fileWriter(list3.toString(),"D:\\javafile\\Patient.txt");




        try {
            fileManager.FileReader("D:\\javafile\\Receptionist.txt");                          //read info from file
        } catch (IOException e) {
            e.printStackTrace();
        }







    }

}
