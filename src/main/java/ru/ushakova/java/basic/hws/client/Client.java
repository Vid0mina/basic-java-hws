package ru.ushakova.java.basic.hws.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());

                System.out.println("Список математических операций: ");
                System.out.println(inputStream.readUTF());

                System.out.println("Введите 2 числа, а также операцию без пробелов в следующем формате 5+5: ");
                Scanner scanner = new Scanner(System.in);
                String expr = scanner.nextLine();
                if (expr.equals("exit")) break;
                client.send(expr);
                client.getServerMessage();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
