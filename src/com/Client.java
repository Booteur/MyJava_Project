package com;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket sClient = new Socket("Localhost", 1234);
            InputStream is = sClient.getInputStream();
            OutputStream os=sClient.getOutputStream();
            Scanner Clavier=new Scanner(System.in);
            System.out.println("Veuillez saisi le nombre");
            int nb=Clavier.nextInt();
            System.out.println("Le chiffre a été saisi");
            os.write(nb);
            int rep=is.read();
            System.out.println("La reponse envoyé par le serveur est : "+rep);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}