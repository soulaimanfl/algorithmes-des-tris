package Elemente;

public class Elemente {
	int cle;
	String valeur;
	
	
	
	public Elemente() { //constructeur null
		this.cle = 0;
		this.valeur =  "0";
	}
		public Elemente(int cle , String valeur) { //contstructeur avec des arguments 
			
			this.cle=cle;
			this.valeur=valeur;
		}


	public int getCle() {  // accesseur
		return cle;
	}

	public void setCle(int cle) { // modificateur
		this.cle = cle;
	}

	public String getValeur() {	// accesseur
		return valeur;
	}

	public void setValeur(String valeur) { // modificateur
		this.valeur = valeur;
	}



	public String toString() {
		return "Elemente [cle=" + cle + ", valeur=" + valeur + "]";
	}
  	
}