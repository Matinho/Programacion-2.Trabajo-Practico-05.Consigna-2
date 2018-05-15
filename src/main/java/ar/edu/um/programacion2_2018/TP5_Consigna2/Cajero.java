package ar.edu.um.programacion2_2018.TP5_Consigna2;

public class Cajero extends Thread{
	private Cliente cliente;
	
	public Cajero() {	
	}
		
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
	
	public Cajero(Cliente cliente) {
		super();
		this.cliente = cliente;               
	}

    public Cliente getCola() {
        return cliente;
    }

    public void setCola(Cliente cliente) {
        this.cliente = cliente;
    }

	public void procesar() throws InterruptedException {
	    
        for (int i = 0; i < this.cliente.productos.size(); i++) {
			if(cliente.productos.get(i) != null) {
				System.out.println("Producto n:" + i);
				cliente.productos.get(i).procesar();        
            }
			else {
				System.out.println("TERMINADO");
			}
		}
	}
}
