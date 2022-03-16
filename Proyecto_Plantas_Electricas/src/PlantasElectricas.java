
public class PlantasElectricas{
	
	private String plantaco;
	private String ciudadgu;
	private String ciudadqui;
	private int cotarifaqui;
	private int cotarifagu;
	private String plantaso;
	private String ciudadloj;
	private int sotarifaqui;
	private int sotarifagu;
	private int sotarifaloj;
	
	public void consumosCocaCodo(int consumo) {
		plantaco = "Coca Codo Sinclair: ";
		ciudadgu = "Guayaquil: ";
		ciudadqui = "Quito: ";
		int consumosqui[] = {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
		int consumosgu[] = {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
		cotarifaqui = 65;
		cotarifagu = 84;
		
		System.out.println(plantaco);
	
		System.out.print(ciudadqui);
		for(int i = 0; i<consumosqui.length;i++)
		{
			System.out.print(consumosqui[i]+"-");
		}
		
		System.out.print(" Tarifa: "+cotarifaqui);
		
		System.out.print("\n"+ciudadgu);
		for(int i = 0; i<consumosgu.length;i++)
		{
			System.out.print(consumosgu[i]+"-");
		}
		
		System.out.print(" Tarifa: "+cotarifagu);
	}
	
	public void consumosSopladora() {
		plantaso = "Sopladora: ";
		ciudadloj = "Loja: ";
		int consumosqui[] = {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
		int consumosgu[] = {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
		int consumosloj[] = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
		sotarifaqui = 55;
		sotarifagu = 79;
		sotarifaloj = 32;
		
		System.out.println(plantaso);
		
		
		System.out.print(ciudadgu);
		for(int i = 0; i<consumosgu.length;i++)
		{
			System.out.print(consumosgu[i]+"-");
		}
		
		System.out.print(" Tarifa: "+sotarifagu);
		
		System.out.print("\n"+ciudadqui);
		for(int i = 0; i<consumosqui.length;i++)
		{
			System.out.print(consumosqui[i]+"-");
		}
		
		System.out.print(" Tarifa: "+sotarifaqui);
		
		System.out.print("\n"+ciudadloj);
		for(int i = 0; i<consumosloj.length;i++)
		{
			System.out.print(consumosloj[i]+"-");
		}
		
		System.out.print(" Tarifa: "+sotarifaloj);
		
	}
}

