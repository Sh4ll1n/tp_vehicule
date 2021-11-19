package tp_vehicule;

public class Pompe {
	
//Attributes
	private String typeCarb;
	private int contenuCarb;
	private int contenanceCarb;
	
// Constructor 
	public Pompe(String typeCarb, int contenuCarb, int contenanceCarb) {
		super();
		this.typeCarb = typeCarb;
		this.contenuCarb = contenuCarb;
		this.contenanceCarb = contenanceCarb;
	}

//Getter/Setter
	public String getTypeCarb() {
		return typeCarb;
	}

	public int getContenuCarb() {
		return contenuCarb;
	}

	public int getContenanceCarb() {
		return contenanceCarb;
	}

	public void setContenuCarb(int contenuCarb) {
		this.contenuCarb = contenuCarb;
	}


	
}
