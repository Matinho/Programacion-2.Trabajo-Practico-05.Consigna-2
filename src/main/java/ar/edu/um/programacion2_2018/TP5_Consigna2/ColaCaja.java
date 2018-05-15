package ar.edu.um.programacion2_2018.TP5_Consigna2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaCaja extends Thread{
        
	private Queue<Cliente> clientes = new LinkedList<Cliente>();

	public ColaCaja() { 
		super();
	}
	
	public Queue<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getCliente() {
		return clientes.poll();
	}

	public void setClientes(Queue<Cliente> clientes) {
		this.clientes = clientes;
	}

}
