package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created by john on 11/23/16.
 */
public class Main2 {
    private static Socket socket;
    public static void main(String[] args) throws IOException, InterruptedException {
        socket =new Socket("127.0.0.1",8082);
        TimeUnit.SECONDS.sleep(2);
        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while(!input.readLine().isEmpty()){
            String url="/home/john/Downloads/MyProject/src/com/company/cank.html";
            File htmlFile = new File(url);
            Desktop.getDesktop().browse(htmlFile.toURI());
        }


    }
}
