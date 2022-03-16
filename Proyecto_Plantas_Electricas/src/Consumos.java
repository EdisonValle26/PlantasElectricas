public class Consumos{
			private String plantaco;
			private String plantaqui;
			private String ciudadgu;
			private String ciudadqui;
			private String ciudadloj;
			private int cototalconsumosqui;
			private int cototalconsumosgu;
			private int sototalconsumosqui;
			private int sototalconsumosgu;
			private int sototalconsumosloj;
			
	public void TotalconsumoCocacodo(int ciudad) {
		plantaco = "Coca Codo Sinclair: ";
		ciudadgu = "Guayaquil: ";
		ciudadqui = "Quito: ";
		cototalconsumosqui = 4753;
		cototalconsumosgu = 920;
		if(ciudad== 1) {
			System.out.println(plantaco);
			System.out.print(ciudadqui);
			System.out.print(" Total de consumo: "+cototalconsumosqui+"\n");
		}
		
		if(ciudad == 2) {
			System.out.println(plantaco);
			System.out.println(ciudadgu);
			System.out.print(" Total de consumo: "+cototalconsumosgu+"\n");	
		}
	}
	
	public void TotalconsumoSopladora(int ciudad) {
		plantaqui = "Sopladora: ";
		ciudadloj = "Loja: ";
		sototalconsumosqui = 3404;
		sototalconsumosgu = 5676;
		sototalconsumosloj = 456;
		if(ciudad == 1) {
			System.out.println(plantaqui);
			System.out.print(ciudadgu);
			System.out.print(" Total de consumo: "+sototalconsumosgu+"\n");
		}
		
		if(ciudad == 2) {
			System.out.println(plantaqui);
			System.out.println(ciudadqui);
			System.out.print(" Total de consumo: "+sototalconsumosqui+"\n");
		}

		if(ciudad == 3) {
			System.out.println(plantaqui);
			System.out.println(ciudadloj);
			System.out.print(" Total de consumo: "+sototalconsumosloj+"\n");
		}
	}
}
