package ru.ushakova.java.basic.hws.client;

import java.io.*;

public class ExampleClient implements AutoCloseable {

    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
    }

    public String getServerMessage() throws IOException {
        String in = inputStream.readUTF();
        System.out.println(in);
        return in;
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }

}
