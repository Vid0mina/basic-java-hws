package ru.ushakova.java.basic.hws.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);
            outputStream.writeUTF("+, -, *, /");
            String res = calculate(inputStream.readUTF());
            System.out.println(res);
            outputStream.writeUTF(res);
            outputStream.flush();
        }
    }

    public static String calculate(String expr) throws NumberFormatException {
        String[] part = expr.split("\\+|\\-|\\*|\\/");
        double firstOperand = Double.parseDouble(part[0]);
        double secondOperand = Double.parseDouble(part[1]);
        String sign = expr.replaceAll("\\d", "").trim();
        double result = 0;
        switch (sign) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            default:
                System.out.println("Операция не найдена.");
                break;
        }
        return String.valueOf(result);
    }

}