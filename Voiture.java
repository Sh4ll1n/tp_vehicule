package tp_vehicule;

public class Voiture extends Vehicule {
	
// Constructor
	public Voiture(int contenueReservoir, int contenanceReservoir, String carburant) {
		super();
		this.contenueReservoir = contenueReservoir;
		this.contenanceReservoir = contenanceReservoir;
		this.carburant = carburant;
	}
	
// Getter
	
	// Method
	public String identifier() {
		return super.identifier()+ "la voiture";
	}
	
	@Override
	public String nbRoue() {
		return "4 roues";
	}
	
	@Override
	public int vmax() {
		return 150;
	}
	
	
	
	
	
	
	
}
	
