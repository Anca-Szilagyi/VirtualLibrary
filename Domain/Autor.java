package Domain;

public class Autor {

			   private String nume; 					// coeficientii ec. aX+b=0;
			   private String origine;
			   private int anNastere;
			   
			   public Autor (String nume, String origine, int an) {
				   //constructor cu un parametru
				   // elemente = un sir de numar intregi
				   this.nume = nume;
				   this.origine = origine;
				   this.anNastere = an;
			   }
			   
			   public Autor(String[] str) {
				   this.nume = str[0];
				   this.origine = str[1];
				   this.anNastere = Integer.parseInt(str[2]);
			   }
			   
			   public Autor() {
				   //constructor implicit
				   this.nume = null;
				   this.anNastere = 0;
				   this.origine = null;
			   }
			
			   public Autor(Autor autorNecunoscut) {
				   //constructor de copiere
				   //this.sir va lua valorile sirului sirulMagic
				   this.nume=autorNecunoscut.nume;
				   this.anNastere = autorNecunoscut.anNastere;
				   this.origine = autorNecunoscut.origine;
			   }
			   
			   
		
			public void setNume(String numeNou){   
				//va seta numarul de elemente al sirului
				//a - numar intreg
				   this.nume=numeNou;
			   }
		
			   public void setAn(int anNou) {
				   //va seta sirul de elemente
				   //elem - un sir de numere intregi
				   this.anNastere = anNou;
			   }
			   public void setOrigine (String origineNoua) {
				   this.origine = origineNoua;
			   }
			   
			   
			   public String getNume()	{      
				   //returneaza numarul de elemente din sirul Sir
				   //numar natural
				   return nume;
			   }
			   
	
			   public int getAn() {
				   //returneaza elementele din Sir
				   //un sir de numere intregi
				   return anNastere;
			   }
			   public String getOrigine() {
				   return origine;
			   }
	  
}

