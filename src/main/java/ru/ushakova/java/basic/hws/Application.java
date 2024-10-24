package ru.ushakova.java.basic.hws;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("***Имя файла и искомые символы вводятся через пробел.***");
        final String line = scanner.nextLine();
        String[] parts = line.split("\\s");
        String fileName = parts[0];
        String sequence = parts[1];
        search(fileName, sequence);
    }

    static void search(String fileName, String sequence) {
        try (FileInputStream fr = new FileInputStream(fileName)) {
            byte[] buffer = fr.readAllBytes();
            String data = new String(buffer, StandardCharsets.UTF_8);
            int count = 0;
            boolean flag = true;

            if (data.contains(sequence)) {
                if (flag) {
                    count = StringUtils.countMatches(data, sequence);
                } else {
                    flag = false;
                }
                System.out.println("Нашлось совпадение по искомому набору символов: " + count + ".");
            } else {
                System.out.println("В заданном файле нет совпадений по искомой последовательности: " + count + ".");
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}