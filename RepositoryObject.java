package Repository;

import java.util.ArrayList;
import Domain.*;
import java.io.File;
@SuppressWarnings("rawtypes")

public class RepositoryObject<T> {
	
		public ArrayList<T> obiecte = new ArrayList<T>();
		
		public RepositoryObject () {
			//this.obiecte = null;
		}
		
		public RepositoryObject(ArrayList<T> objects) {
			this.obiecte = objects;
		}
		
		
		
		public boolean addObject(T object) {
			//adaugare carte
			//verificam daca exista deja in baza de date o carte cu acelasi ID;
			/*for(int i=0; i<this.carti.size(); i++)
				if(this.obiecte.get(i).getID()==obiecte.getID()) return false;*/
			int k = 1;
			for(int j = 0; j<this.getSize(); j++)
				if(object == this.obiecte.get(j)) k =0;
			if(k==1) this.obiecte.add(object);
			return true;
		}
		
		public int getSize() {
			return this.obiecte.size();
		}
		
		//de suprascris pentru fiecare repo in parte.

		
		/*public boolean updateCarte(Carte carte, int id) {
			//se va modifica acea carte care are id-ul egal cu id cu parametrii cartii Carte
			//daca acest id exista deja in BD, atunci nu se va face modificarea
			//for(int i=0; i<this.obiecte.size(); i++) {
				//if(this.carti.get(i).getID()==carte.getID()) return false; //s-a gasit o carte care are deja acest id
			//}
			for(int i=0; i<this.carti.size(); i++) {
				if(this.carti.get(i).getID() == id) { this.carti.set(i, carte);
													  return true;
													}
				}
			return true;
		}*/
		
		public boolean deleteObject(int id){
			//stergere carte daca id-ul exista in baza de date
			/*for(int i=0; i<this.carti.size(); i++)
				if(this.carti.get(i).getID() == id) { carti.remove(i);
													  return true;
													}*/
				obiecte.remove(id);
			return false;
		}
		
		public ArrayList<T> getAllObjects() {
			return this.obiecte;
		}
		
}
