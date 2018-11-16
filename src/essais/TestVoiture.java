package essais;

import entites.Voiture;

public class TestVoiture {
	
	public static void main(String[] args) {
		

		Voiture Guilieta = new Voiture("Alpha Romeo", "310 km","350 CV");
		
		Voiture Talisman = new Voiture("Renault", "240 km","255 CV");
		
		Voiture Corsa = new Voiture("Opel", "220 km","220 CV");
		
	
		Voiture[] voitures = {Guilieta, Talisman, Corsa };
		
		System.out.println("Le nombre de voiture est de " + voitures.length);
		
		for(int i=0; i<voitures.length; i++) {
			
			System.out.println(voitures[i].toString());
		
		}
		
		
		
	}
	
}

