/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Leonardo Messeri 5BIA
 */
public class client {

    /**
     * @param args the command line arguments
     */
        String nomeServer = "localhost";
        int portaServer = 1237;
        Socket socket;
        DataOutputStream out;
        DataOutputStream in;
        BufferedReader tastiera;
        String comando;
        
        
        public Socket connetti() throws IOException {
            
            System.out.println("Client in esecuzione");
            BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
            Socket socket = new Socket ("localhost", 1237);
            DataOutputStream out = new DataOutputStream (socket.getOutputStream());
            DataInputStream in = new DataInputStream (socket.getInputStream());
            
            
            return socket;
        }
        
        public void comunica() throws IOException{
            System.out.println("Inserisci l'operazione da svolgere");
            String comando = tastiera.readLine();
            System.out.print("Invio del comando al server");
            out.writeBytes(comando +'\n');
            comando = in.readLine();
            System.out.print("Chiusura della connessione");
            socket.close();
        }
}

