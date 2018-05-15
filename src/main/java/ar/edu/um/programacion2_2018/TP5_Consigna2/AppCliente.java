package ar.edu.um.programacion2_2018.TP5_Consigna2;

import java.io.IOException;

public class AppCliente {
    public static void main(String[] args) throws IOException
    {  
    	Socket_Cliente cli = new Socket_Cliente(); //Se crea el cliente
        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
}