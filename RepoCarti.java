package Repository;
import java.util.ArrayList;
import Domain.*;
//import java.io.File;

// DE FACUT CREATE!!!!!!!
public class RepoCarti extends RepositoryObject<CarteImprumutata>{
	//public ArrayList<Carte> carti;
	private RepoFile fisier = new RepoFile("CartiLab4.txt");
	private RepositoryObject<Autor> autori = new RepositoryObject<Autor>();
	
	public RepoCarti () {
		//this.obiecte = null;
	}
	
	public RepoCarti(ArrayList<CarteImprumutata> carti) {
		this.obiecte = carti;
	}
	
	//adaugare carte
	//verificam daca exista deja in baza de date o carte cu acelasi ID;

	public CarteImprumutata getCartea(int id) {
		for(int i = 0; i<this.getAllObjects().size(); i++)
			if (this.getAllObjects().get(i).getID() == id) return this.getAllObjects().get(i);
		return null;
	}
	
	public boolean updateCarte(CarteImprumutata carte, int id) {
		//se va modifica acea carte care are id-ul egal cu id cu parametrii cartii Carte
		//daca acest id exista deja in BD, atunci nu se va face modificarea
		for(int i=0; i<this.obiecte.size(); i++) {
			if(this.obiecte.get(i).getID()==carte.getID()) return false; //s-a gasit o carte care are deja acest id
		}
		for(int i=0; i<this.obiecte.size(); i++) {
			if(this.obiecte.get(i).getID() == id) { this.obiecte.set(i, carte);
												  return true;
												}
			}
		return true;
	}
	
	@Override
	public boolean deleteObject(int id){
		//stergere carte daca id-ul exista in baza de date
		for(int i=0; i<this.obiecte.size(); i++)
			if(this.obiecte.get(i).getID() == id) { obiecte.remove(i);
												  return true;
												}
			
		return false;
	}
	public float valoareTotalaCarti() {
		float sum = 0;
		for(int i=0; i<this.obiecte.size(); i++)
			if(this.obiecte.get(i).getImprumutata()) sum+=this.obiecte.get(i).getPret();
		return sum;
	}
	
	@Override
	public boolean addObject(CarteImprumutata carte) { 
		for(int i=0; i<this.obiecte.size(); i++)
			if(this.obiecte.get(i).getID()==carte.getID()) return false;

		this.obiecte.add(carte);
		autori.addObject(carte.getAutor());
		

		return true;
	}
	
	public void adaugareaDinFisier() {

		for(int i=0; i<fisier.getObiecteDinFisier().size(); i++) {

			String str = fisier.getObiecteDinFisier().get(i);

			String[] splitted = str.split(", ");
			Autor autor = new Autor(splitted[2], splitted[3], Integer.parseInt(splitted[4]));
			Editura editura = new Editura(splitted[7], Integer.parseInt(splitted[8]), splitted[9]);
			Carte carte = new Carte(Integer.parseInt(splitted[0]), splitted[1], autor, 
					Integer.parseInt(splitted[5]), Float.parseFloat(splitted[6]), editura);
			CarteImprumutata carteImprumutata = new CarteImprumutata(carte, Integer.parseInt(splitted[10]));
			
			this.addObject(carteImprumutata);
		}

	}
	
	public ArrayList<Autor> getAutori() {
		
		return this.autori.getAllObjects();
	}
	
	
}
