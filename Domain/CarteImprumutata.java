package Domain;

public class CarteImprumutata extends Carte {
	private boolean imprumutata;
	
	//agregare
	public CarteImprumutata(int id, String nume, Autor autor, int an, float pret, Editura editura, boolean imprumutata) {
		super(id, nume, autor, an, pret, editura);
		this.imprumutata = imprumutata;
	}
	public CarteImprumutata() {
		super();
		this.imprumutata = false;
	}
	
	public CarteImprumutata(Carte carte, int impr) {
		super(carte);
		if(impr == 1) this.imprumutata = true;
		else this.imprumutata = false;
	}
	public CarteImprumutata(CarteImprumutata c) {
		super(c.getID(), c.getTitlu(), c.getAutor(), c.getAn(), c.getPret(), c.getEditura());
		this.imprumutata = c.getImprumutata();
	}
	
	public boolean getImprumutata() {
		return this.imprumutata;
	}
	
	public void setImprumutata(boolean statement) {
		this.imprumutata = statement;
	}
	
}
