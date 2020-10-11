/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;

/**
 *
 * @author Leonardo Messeri 5BIA
 */
public class clientMain {
    public static void main(String[] args) throws IOException {
        client cliente = new client();
        cliente.connetti();
        cliente.comunica();
    }
}
