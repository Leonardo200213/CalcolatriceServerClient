/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Leonardo Messeri 5BIA
 */
public class server {
    
    ServerSocket server = null;
    Socket client = null;
    String comando = null;
    String risposta = null;
    BufferedReader Sin;
    DataOutputStream Sout;
    int num1 = 0;
    int num2 = 0;
    Operazioni x;
    
    public Socket attendi() throws IOException
    {
        System.out.println("Server in esecuzione");
        server = new ServerSocket(1237);
        client = server.accept();
        server.close();
        Sin = new BufferedReader(new InputStreamReader (client.getInputStream()));
        Sout = new DataOutputStream(client.getOutputStream());
        return client;
    }
    
    public void comunica(){
        x = new Operazioni(num1, num2);
        System.out.println("Scegli: 1 = addizione" + "\n" + "2 = sottrazione" + "\n" + "3 = moltiplicazione" + "\n" + "4 = divisione" + "\n");
        switch(x) {
            case 1 : {
                x.addizione();
                break;
            }
            case 2 : {
                x.sottrazione();
                break;
            }
            case 3 : {
                x.moltiplicazione();
                break;
            }
            case 4 : {
                x.divisione();
                break;
            }
        }
    }
}
