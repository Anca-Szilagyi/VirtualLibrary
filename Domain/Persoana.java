package Domain;

import java.util.ArrayList;
//functie de compare in functie de nr de carti imprumutate

public class Persoana {
			   private int id;
			   private String nume;
			   private String prenume;// coeficientii ec. aX+b=0;
			   private int varsta;
			   private String observatii; //student, profesor, bibliotecar etc;
			   private ArrayList<Integer> cartiImprumutate; //va contine id-urile cartilor din lista
			   
			   public Persoana (int id, String nume, String prenume, int varsta, String obs, ArrayList<Integer> cartiImprumutate) {
				   //constructor cu un parametru
				   // elemente = un sir de n   umar intregi
				   this.nume = nume;
				   this.prenume = prenume;
				   this.varsta = varsta;
				   this.observatii = obs;
				   this.cartiImprumutate = cartiImprumutate;
				   this.id = id;
			   }
			   public int getID() {
					return this.id;
				}
			   public void setID(int newId) {
				   this.id = newId;
			   }
			   
			   public Persoana() {
				   //constructor implicit
				   this.id=0;
				   this.nume = null;
				   this.prenume = null;
				   this.varsta = 0;
				   this.observatii = null;
				   this.cartiImprumutate = null;
			   }
			
			   public Persoana(Persoana person) {
				   //constructor de copiere
				   //this.sir va lua valorile sirului sirulMagic
				   this.id = person.id;
				   this.nume = person.nume;
				   this.prenume = person.prenume;
				   this.varsta = person.varsta;
				   this.observatii = person.observatii;
				   this.cartiImprumutate = person.cartiImprumutate;
			   }
			   
			   
			public void setNume (String numeNou) {
				this.nume = numeNou;
			}
			public void setPrenume(String prenumeNou) {
				this.prenume = prenumeNou;
			}
			
			public void setVarsta(int ani) {
				this.varsta = ani;
			}
			
			public void setObs(String obs) {
				this.observatii = obs;
			}
			
			public void setCartiImprumutate(ArrayList<Integer> cartiImprumutate) {
				this.cartiImprumutate = cartiImprumutate;
			}
			
			public void addCarti(ArrayList<Integer> carti) {
				for(int i=0; i<carti.size(); i++) 
					this.cartiImprumutate.add(carti.get(i));
			}
			
			public String getNume () {
				return this.nume;
			}
			public String getPrenume() {
				return this.prenume;
			}
			
			public int getVarsta() {
				return this.varsta;
			}
			
			public String getObservatii() {
				return this.observatii;
			}
			
			public ArrayList<Integer> getCartiImprumutate() {
				return this.cartiImprumutate;
			}
			
			
		  
}
