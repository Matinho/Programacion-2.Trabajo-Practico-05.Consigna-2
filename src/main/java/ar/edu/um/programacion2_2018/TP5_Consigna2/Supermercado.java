package ar.edu.um.programacion2_2018.TP5_Consigna2;
import java.io.IOException;

public class Supermercado {
    
public static void main(String[] args) throws IOException
    {
        Socket_Servidor serv = new Socket_Servidor(); //Se crea el servidor
        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}
