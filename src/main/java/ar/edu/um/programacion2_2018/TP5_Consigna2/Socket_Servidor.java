package ar.edu.um.programacion2_2018.TP5_Consigna2;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Socket_Servidor extends Conexion {//Se hereda de conexión para hacer uso de los sockets y demás

	public Socket_Servidor() throws IOException{//Se usa el constructor para servidor de Conexion
		super("servidor");
	} 

    public void startServer()//Método para iniciar el servidor
    {
    	try{
			System.out.println("Esperando... ");
			cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente
            System.out.println("Cliente en línea");
 
            ObjectInputStream entrada = new ObjectInputStream (cs.getInputStream()); 
            
            while(true) {
            	Cliente cli =  (Cliente)entrada.readObject();
            	try {
                    Dividir_Cajero div=new Dividir_Cajero(cli);
                    div.dividir();
               }catch (NullPointerException e) {
            	   break;
               }     	            
            }
        }
    	catch(Exception e){
    		System.out.println(e.getMessage());
        }
    }
}
