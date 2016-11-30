package com.company;

import java.io.*;
import java.net.Socket;

/**
 * Created by john on 11/28/16.
 */
public class MyThread extends Thread {

        protected Socket socket;

        public MyThread(Socket clientSocket) {
            this.socket = clientSocket;
        }

        public void run() {
            PrintWriter out=null;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                out.write(1);
                out.flush();
                socket.close();
            } catch (IOException e) {
                return;
            }
        }
    }

