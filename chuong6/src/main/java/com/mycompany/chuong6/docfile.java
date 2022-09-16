package com.mycompany.chuong6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class docfile {
    public static void main(String[] args) {
        File text = new File("file.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
