package Domain;

public class Editura {


				   private String nume;
				   private int anInfiintare;
				   private String adresa;
				   
				   public Editura (String nume, int an, String adresa) {
					   //constructor cu un parametru
					   // elemente = un sir de numar intregi
					   this.nume = nume;
					   this.anInfiintare = an;
					   this.adresa = adresa;
				   }
				   
				   public Editura() {
					   //constructor implicit
					   this.nume = null;
					   this.anInfiintare = 0;
					   this.adresa = null;
				   }
				
				   public Editura (Editura Humanitas) {
					   //constructor de copiere
					   //this.sir va lua valorile sirului sirulMagic
					   this.nume=Humanitas.nume;
					   this.anInfiintare = Humanitas.getAnInfiintare();
					   this.adresa = Humanitas.adresa;
				   }
				   
				   
			
				public void setNume(String numeNou){   
					//va seta numarul de elemente al sirului
					//a - numar intreg
					   this.nume=numeNou;
				   }
			
				   public void setAn(int anNou) {
					   //va seta sirul de elemente
					   //elem - un sir de numere intregi
					   this.anInfiintare = anNou;
				   }
				   
				   public void setAdresa (String adresaNoua) {
					   this.adresa = adresaNoua;
				   }
				   
				   
				   public String getNume()	{      
					   //returneaza numarul de elemente din sirul Sir
					   //numar natural
					   return nume;
				   }
				   
				   public int getAnInfiintare() {
					   return anInfiintare;
				   }
				   
				   public String getAdresa() {
					   return adresa;
				   }
				   
				 
		  
	}

