import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Consumos consumo = new Consumos();
		Ciudad ciudades = new Ciudad(4753, 920, 3404, 5676, 456);
		Region regiones = new Region(4753, 920, 3404, 5676, 456);
		
		int planta =0;
		int ciudad = 0;
		int region = 0;
		
		int op = -1;
		while(op!=0) 
		{
			System.out.println("\n<1> Mostrar el total de consumos de una ciudad en una planta.");
			System.out.println("<2> Mostrar el total de consumos de una planta las diferentes ciudades.");
			System.out.println("<3> Mostar cuanto dinero ha recaudado una región comparado con la región Sierra.");
			System.out.println("<0> Salir");
			
			System.out.println("Ingrese una opción: ");
			op = scan.nextInt();
			switch(op) 
			{
			case 1:

				System.out.println("Las plantas son: ");
				System.out.println(" 1 --> Coca Codo Sinclair");
				System.out.println(" 2 --> Sopladora");
				
				System.out.println("Ingrese una opción para elegir una planta");
				planta = scan.nextInt();
				if(planta== 1 )
				{
					System.out.println("Las ciudades son: ");
					System.out.println(" 1 --> Quito");
					System.out.println(" 2 --> Guayaquil");
					
					System.out.println("Ingrese una opción para elegir una ciudad");
					ciudad = scan.nextInt();
					consumo.TotalconsumoCocacodo(ciudad);
					
				}
				if(planta == 2)
				{
					System.out.println("Las ciudades son: ");
					System.out.println(" 1 --> Guayaquil");
					System.out.println(" 2 --> Quito");
					System.out.println(" 3 --> Loja");
					
					System.out.println("Ingrese una opción para elegir una ciudad");
					ciudad = scan.nextInt();
					consumo.TotalconsumoSopladora(ciudad);
				}
				break;
				
			case 2:
				
				System.out.println("\nTodas las ciudades que estan en más que sea 1 planta son: ");
				System.out.println(" 1 --> Quito");
				System.out.println(" 2 --> Guayaquil");
				System.out.println(" 3 --> Loja");
				
				System.out.println("Ingrese una opción para elegir una ciudad");
				ciudad = scan.nextInt();
				ciudades.totalconsumoCiudades(ciudad);
				break;
			
			case 3:
				
				System.out.println("Las regiones son: ");
				System.out.println(" 1 --> Sierra con las ciudades: Quito, Ambato y Loja");
				System.out.println(" 2 --> Costa con las ciudades: Guayaquil y Manta");
				System.out.println(" 3 --> Oriente con las ciudades: Tena y Nueva Loja");
				
				System.out.println("Ingrese una opción para elegir una región");
				region = scan.nextInt();
				regiones.Sumadetarifaspormeses(region);
				
				break;
			
			}
		}
	}

}
