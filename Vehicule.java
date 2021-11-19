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
			(pompe.getContenuCarb() >= getContenanceReservoir()) ) {
			
			System.out.println("Je dois faire le plein car " + getContenueReservoir()+ "L sur " + getContenanceReservoir()+"L." );
			System.out.println("La pompe possède " +pompe.getContenuCarb()+" sur "+pompe.getContenanceCarb()+" litres." );
			System.out.println("Je suis en train de faire le plein...");
			
			this.setContenueReservoir( this.getContenanceReservoir() );
			pompe.setContenuCarb(pompe.getContenuCarb() - this.getContenueReservoir() );
			
			System.out.println("Mon plein est fait je suis à "+ getContenueReservoir()+ "L sur "+ getContenanceReservoir()+"L.");
			System.out.println("La pompe possède " +pompe.getContenuCarb()+" sur "+pompe.getContenanceCarb()+" litres." );
			
			
		} else {
		System.out.println("Il vous manque une des conditions suivantes pour faire un plein: Niveau du reservoir, le bon type de carburant ou de l'essence dans la pompe");
		}
	}


}
	








/* switch(pompe){
 * case pompe.getContenuCarb() >= getContenanceReservoir() || getContenueReservoir() < getContenanceReservoir() || getCarburant() == pompe.getTypeCarb():
 * 		BLABLA BLOCKED
 * case pompe.getContenuCarb() >= getContenanceReservoir() || getContenueReservoir() < getContenanceReservoir() || getCarburant() != pompe.getTypeCarb():
 * 		System.out.println("La pompe qui a un carburant "+ pompe.TypeCarb() + " ne correspond pas à " + identifier()+".";
 * 		break;
 * case pompe.getContenuCarb() >= getContenanceReservoir() || getContenueReservoir() > getContenanceReservoir() || getCarburant() == pompe.getTypeCarb():
 * 		System.out.println("Vous êtes fort ! Etes-vous Dieu ?";
 * 		break;
 * case pompe.getContenuCarb() < (getContenanceReservoir()-getContenueReservoir()) || getContenueReservoir() < getContenanceReservoir() || getCarburant() == pompe.getTypeCarb():
 * 		System.out.println("Pas de bol pas assez de carburant" + TypeCarb() + " pour faire le plein";
 * 		break;
 * */
	
		
		
		
	


