package ru.ushakova.java.basic.hws.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler {

    //хранит текущее соединение
    private final Socket clientSocket;
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ClientHandler(Socket clientSocket, DataInputStream inputStream, DataOutputStream outputStream) {
        this.clientSocket = clientSocket;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }

}
