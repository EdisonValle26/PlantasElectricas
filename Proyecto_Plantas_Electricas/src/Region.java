
public class Region extends Ciudad{
	
	private int sumacosta;
	private int sumasierra;
	private String sumaoriente;
	
	public Region(int cototalconsumosqui, int cototalconsumosgu, int sototalconsumosqui, int sototalconsumosgu,
			int sototalconsumosloj) {
		super(cototalconsumosqui, cototalconsumosgu, sototalconsumosqui, sototalconsumosgu, sototalconsumosloj);
		
	}
	
	public void Sumadetarifaspormeses(int regiones) {
		
		if(regiones == 1) {
			System.out.println("Sierra: "); 
			sumasierra = (cototalconsumosqui*65) + (sototalconsumosqui*79) + (sototalconsumosloj*32);
			System.out.println("El dinero que ha recaudado la Región Sierra es: "+sumasierra);
		}
		
		if(regiones == 2) {
			System.out.println("Costa: ");
			sumacosta = (cototalconsumosgu*84) + (sototalconsumosgu*55);
			System.out.println("El dinero que ha recaudado la Región Costa es: "+sumacosta);
			System.out.println("Pero la region Sierra: ");
			System.out.println("El dinero que ha recaudado la Región Sierra es: "+sumasierra);
		}
		
		if(regiones == 3) {
			System.out.println("Oriente: ");
			sumaoriente = "Información no disponible";
			System.out.println(sumaoriente);
			System.out.println("Pero la region Sierra: ");
			System.out.println("El dinero que ha recaudado la Región Sierra es: "+sumasierra);
		}
		
	}
}
