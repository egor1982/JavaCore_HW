package lesson5;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("file.csv");

        String[] headers = {"Value 1", "Value 2", "Value 3"};

        int[][] data = {
                {100, 200, 123},
                {300, 400, 500},
        };

        AppData appData = new AppData(headers, data);

        appData.save(file);
        appData.load(file);
        appData.readAppData();
    }
}
