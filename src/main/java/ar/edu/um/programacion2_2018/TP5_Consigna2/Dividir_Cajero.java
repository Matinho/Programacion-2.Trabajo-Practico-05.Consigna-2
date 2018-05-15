package ar.edu.um.programacion2_2018.TP5_Consigna2;

public class Dividir_Cajero extends Thread{
	private Cliente cliente;
    private static int num_cajero;

    public Dividir_Cajero() {	
	}
	
	public Dividir_Cajero(Cliente cliente) {
		super();
		this.cliente = cliente;
        num_cajero=num_cajero+1;
            if(num_cajero==6){   
            	num_cajero=1;
            } 
        }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	public void dividir() throws InterruptedException  {
        switch (num_cajero) {
            case 1:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                Cajero c1= new Cajero(cliente);
                c1.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                Cajero c2= new Cajero(cliente);
                c2.procesar();
                System.out.println("------------------------------------------------------------------------"); 
                break;
            case 3:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                Cajero c3= new Cajero(cliente);
                c3.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                Cajero c4= new Cajero(cliente);
                c4.procesar();
                System.out.println("------------------------------------------------------------------------"); 
                break;
            case 5:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                Cajero c5= new Cajero(cliente);
                c5.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            
       }
   }           
}
	


