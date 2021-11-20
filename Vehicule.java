package tp_vehicule;

public abstract class Vehicule {
// Attributes
	protected int contenueReservoir;
	protected int contenanceReservoir;
	protected String carburant;

// Identified inheritance of Vehicle 
	public String identifier() {
		return "Je suis le véhicule ";
	}
	
// Method 

	public abstract String nbRoue(); 
	
	public abstract int vmax(); 
	
	public void setContenueReservoir(int contenueReservoir) {
		this.contenueReservoir = contenueReservoir;
	}

	public int getContenanceReservoir() {
		return contenanceReservoir;
	}
	
	public int getContenueReservoir() {
		return contenueReservoir;

	}
	public String getCarburant() {
		return carburant;
	}

// Method of Vehicle to fill up 
	protected void fairePlein(Pompe pompe) {
		if ((getContenueReservoir() < getContenanceReservoir()) &&
				(getCarburant() == pompe.getTypeCarb()) &&
				(pompe.getContenuCarb() >= (getContenanceReservoir()-getContenueReservoir())) ) {
			
				System.out.println("Je dois faire le plein car " + getContenueReservoir()+ "L sur " + getContenanceReservoir()+"L." );
				System.out.println("La pompe possède " +pompe.getContenuCarb()+" sur "+pompe.getContenanceCarb()+" litres." );
				System.out.println("Je suis en train de faire le plein...");
				
				
				pompe.setContenuCarb(pompe.getContenuCarb() - (this.getContenanceReservoir()-this.getContenueReservoir()) );
				this.setContenueReservoir( (this.getContenanceReservoir()-this.getContenueReservoir())+this.getContenueReservoir() );
				
				System.out.println("La pompe possède après mon plein " +pompe.getContenuCarb()+" sur "+pompe.getContenanceCarb()+" litres." );
				System.out.println("Mon plein est fait je suis à "+ getContenueReservoir()+ "L sur "+ getContenanceReservoir()+"L.");
			
			
		} else if ((getContenueReservoir() > getContenanceReservoir()) &&
				(getCarburant() == pompe.getTypeCarb()) &&
				(pompe.getContenuCarb() >= (getContenanceReservoir()-getContenueReservoir()))) {
				System.out.println("Vous êtes fort ! Etes-vous Dieu ?");
			
		} else if ((getContenueReservoir() < getContenanceReservoir()) &&
				(getCarburant() != pompe.getTypeCarb()) &&
				(pompe.getContenuCarb() >= (getContenanceReservoir()-getContenueReservoir()))){
				System.out.println("La pompe qui a un carburant "+ pompe.getTypeCarb() + " ne correspond pas à votre véhicule qui est de type " + getCarburant()+".");
			
		} else if ((getContenueReservoir() < getContenanceReservoir()) &&
				(getCarburant() == pompe.getTypeCarb()) &&
				(pompe.getContenuCarb() < (getContenanceReservoir()-getContenueReservoir()))) {
			System.out.println("Pas de bol pas assez de carburant " + pompe.getTypeCarb() + " pour faire le plein");
		} else {
	
				System.out.println("Il vous manque plusieurs conditions pour réaliser votre plein. Vérifiez: Niveau du reservoir, type de carburant ou il n'y a pas assez dans la pompe pour faire un plein");
		}
}
}
	
	
		
		
		
	


