package com;

import java.awt.*;
import java.net.*;
import java.io.*;

public class Serveur {
    public static void main(String[] args) {
            try {
                ServerSocket ss = new ServerSocket(1234);
                while (true) {
                    System.out.println("en attente de connexion");
                    Socket s = ss.accept();
                    System.out.println("Connexion établie");
                    InputStream is = s.getInputStream();
                    OutputStream os = s.getOutputStream();
                    System.out.println("Veuillez saisir un nombre");
                    int nb = is.read();
                    int rep = nb * 3;
                    System.out.println("La réponse a été envoyée au client");
                    os.write(rep);
                    //ss.close();
                }

            } catch (Exception e) {
                e.getStackTrace();
        }

    }
}