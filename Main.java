package tp_vehicule;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==========EXO 2 ==========");
		//Moto (contenu, contenance, type carburant)
		Moto m = new Moto(15,25,"essence");
		//Voiture (contenu, contenance, type carburant)
		Voiture v = new Voiture(45,90,"diesel");
		
		System.out.println(m.identifier());
		System.out.println(v.identifier());
		
		System.out.println(m.nbRoue());
		System.out.println("================================================");
		//Pompe (type Carburant, contenu, contenance)
		Pompe pompe = new Pompe("essence", 500, 1000);
		
		m.fairePlein(pompe);
		System.out.println("================================================");
		v.fairePlein(pompe);
		
		
		
		
	}
}
