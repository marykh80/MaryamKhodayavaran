package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class FileManager {

    public void fileWriter(String data, String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void FileReader(String filePath) throws IOException {
        FileReader fr=new FileReader(filePath);
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}


