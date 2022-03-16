

public class Ciudad{

	protected int cototalconsumosqui;
	protected int cototalconsumosgu;
	protected int sototalconsumosqui;
	protected int sototalconsumosgu;
	protected int sototalconsumosloj;
	
	public Ciudad(int cototalconsumosqui,int cototalconsumosgu, int sototalconsumosqui
			,int sototalconsumosgu, int sototalconsumosloj) {
		this.cototalconsumosgu = cototalconsumosgu;
		this.sototalconsumosgu = sototalconsumosgu;
		this.cototalconsumosqui = cototalconsumosqui;
		this.sototalconsumosqui = sototalconsumosqui;
		this.sototalconsumosloj = sototalconsumosloj;
	}

	public void totalconsumoCiudades(int ciudad) {

		if(ciudad== 1) {
			System.out.print("Quito: ");
			System.out.print(" Total de consumo: "+(cototalconsumosqui+sototalconsumosqui)+"\n");
		}
		
		if(ciudad == 2) {

			System.out.println("Guayaquil: ");
			System.out.print(" Total de consumo: "+(cototalconsumosgu+sototalconsumosgu)+"\n");	
		}
		
		if(ciudad == 3) {
			System.out.println("Loja: ");
			System.out.print(" Total de consumo: "+sototalconsumosloj+"\n");
		}
		
		
		
	}
		
		
	
}
