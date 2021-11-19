package tp_vehicule;

public class Moto extends Vehicule {
	
// Constructor
	public Moto(int contenueReservoir, int contenanceReservoir, String carburant) {
		super();
		this.contenueReservoir = contenueReservoir;
		this.contenanceReservoir = contenanceReservoir;
		this.carburant = carburant;
	}
	
// Method
	public String identifier() {
		return super.identifier()+ "la moto";
	}
	
	@Override
	public String nbRoue() {
		return "2 roues";
	}

	@Override
	public int vmax() {
		return 200;
	}
	
	
	

	

}
