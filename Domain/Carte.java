package Domain;
@SuppressWarnings("rawtypes")
public class Carte {
				private int id;
			   private String titlu; 					// coeficientii ec. aX+b=0;
			   private Autor autor;
			   private int anAparitie;
			   private float pret;
			   private Editura editura;
			   
			   public Carte (int id, String nume, Autor autor, int an, float pret, Editura editura) {
				   //constructor cu un parametru
				   // elemente = un sir de n   umar intregi
				   this.id = id;
				   this.titlu = nume;
				   this.autor = new Autor(autor);
				   this.anAparitie = an;
				   this.pret = pret;
				   this.editura = new Editura(editura);
			   }
			   
			   public Carte() {
				   //constructor implicit
				   this.id = 0;
				   this.titlu = null;
				   this.autor = new Autor();
				   this.anAparitie = 0;
				   this.pret = 0;
				   this.editura = new Editura();
			   }
			
			   public Carte(Carte book) {
				   //constructor de copiere
				   //this.sir va lua valorile sirului sirulMagic
				   this.id = book.id;
				   this.titlu = book.titlu;
				   this.autor = new Autor (book.autor);
				   this.anAparitie = book.anAparitie;
				   this.pret = book.pret;
				   this.editura = new Editura(book.editura);
			   }
			   
			   
			public void setTitlu (String titluNou) {
				this.titlu = titluNou;
			}
			public void setAutor(Autor autorNou) {
				this.autor = new Autor(autorNou);
			}
			
			public void setAn(int anNou) {
				this.anAparitie = anNou;
			}
			
			public void setPret(float pretNou) {
				this.pret = pretNou;
			}
			
			public void setEditura(Editura edituraNoua) {
				this.editura = new Editura(edituraNoua);
			}
			public void setID(int newId) {
				this.id = newId;
			}
			
			public String getTitlu () {
				return this.titlu;
			}
			public Autor getAutor() {
				return this.autor;
			}
			
			public int getAn() {
				return this.anAparitie;
			}
			
			public float getPret() {
				return this.pret;
			}
			
			public Editura getEditura() {
				return this.editura;
			}
			public int getID() {
				return this.id;
			}
		  
}
