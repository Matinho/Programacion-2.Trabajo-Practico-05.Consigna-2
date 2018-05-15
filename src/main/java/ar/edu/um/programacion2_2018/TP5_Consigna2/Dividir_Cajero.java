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
		
		Cajero c1=new Cajero();
        Cajero c2=new Cajero();
        Cajero c3=new Cajero();
        Cajero c4=new Cajero();
        Cajero c5=new Cajero();
		
        switch (num_cajero) {
            case 1:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                c1.setCliente(cliente);
                c1.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                c2.setCliente(cliente);
                c2.procesar();
                System.out.println("------------------------------------------------------------------------"); 
                break;
            case 3:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                c3.setCliente(cliente);
                c3.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                c4.setCliente(cliente);
                c4.procesar();
                System.out.println("------------------------------------------------------------------------"); 
                break;
            case 5:
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Cajero "+num_cajero+" esta atendiendo al Cliente: "+cliente.getNombre_cliente());
                c5.setCliente(cliente);
                c5.procesar();
                System.out.println("------------------------------------------------------------------------");
                break;
            
       }
   }           
}
	


