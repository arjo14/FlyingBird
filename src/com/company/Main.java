package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        serverSocket = new ServerSocket(8083);
        while (true) {
            socket = serverSocket.accept();
            new MyThread(socket).start();
        }
    }
}
