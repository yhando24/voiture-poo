package entites;

public class Voiture {
	
	
	private String marque;
	private String vitesse;
	private String puissance;
	
	
	
	public Voiture(String marque, String vitesse, String puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	public String getPuissance() {
		return puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
	
	
	public String toString() {
		
		return "marque => "+this.marque+". vitesse => " + this.vitesse+ ". puissance => " + this.puissance;
		
	}
	

}
