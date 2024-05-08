package ru.ushakova.java.basic.hws;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        showFilesList();
        File inFile = readInputFileName();
        showFileContent(inFile);
        writeTextToFile(inFile);
    }

    public static File readInputFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла, с которым будете работать: ");
        String fileName = scanner.nextLine();
        File inFile = new File("hw/" + fileName);
        if (inFile.canRead()) {
            try (FileInputStream fis = new FileInputStream(inFile);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 InputStreamReader in = new InputStreamReader(bis)
            ) {
                byte[] buffer = fileName.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < buffer.length; i++) {
                    in.read();
                }
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        } else {
            try {
                inFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return inFile;
    }

    public static void showFileContent(File inFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String content;
            while ((content = br.readLine()) != null) System.out.println(content);
        } catch (IOException ee) {
            throw new RuntimeException(ee.getMessage());
        }
    }

    public static void writeTextToFile(File inFile) {
        System.out.print("Введите текст (для выхода введите <exit>): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            try (FileWriter writer = new FileWriter(inFile, true)
            ) {
                if (text.equals("exit")) {
                    scanner.close();
                    break;
                }
                writer.write(text + "\n");
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        scanner.close();
    }

    public static void showFilesList() {
        File file = new File("hw");
        System.out.println("Список файлов в директории " + "<" + file.getPath() + ">: " + Arrays.toString(file.listFiles()));
    }

}