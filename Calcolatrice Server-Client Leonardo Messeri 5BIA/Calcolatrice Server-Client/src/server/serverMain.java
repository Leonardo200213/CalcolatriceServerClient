/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;

/**
 *
 * @author Leonardo Messeri 5BIA
 */
public class serverMain {
    public static void main(String[] args) throws IOException {
        server serv = new server();
        serv.attendi();
        serv.comunica();
    }
}
