package Repository;
import java.util.ArrayList;
import Domain.*;
public class RepoCititori extends RepositoryObject<Persoana>{

	private RepoFile fisier = new RepoFile("CititoriLab4.txt");
		
		public RepoCititori () {
			//this.obiecte = null;
		}
		
		public RepoCititori(ArrayList<Persoana> cititori) {
			this.obiecte = cititori;
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
	
		
		@Override
		public boolean addObject(Persoana pers) { 
			for(int i=0; i<this.obiecte.size(); i++)
				if(this.obiecte.get(i).getID()==pers.getID()) return false;

			this.obiecte.add(pers);
			return true;
		}
		
		public void adaugareaDinFisier() {

			for(int i=0; i<fisier.getObiecteDinFisier().size(); i++) {

				String str = fisier.getObiecteDinFisier().get(i);

				String[] splitted = str.split(", ");
				ArrayList<Integer> cartiImpr = new ArrayList<Integer>();
				for(int j=5; j<splitted.length; j++) cartiImpr.add(Integer.parseInt(splitted[j]));
				Persoana pers = new Persoana(Integer.parseInt(splitted[0]), splitted[1], splitted[2], 
						Integer.parseInt(splitted[3]), splitted[4], cartiImpr);
				
				this.addObject(pers);
			}
		}

		public int better(Persoana pers1, Persoana pers2) {
			if(pers1.getCartiImprumutate().size()>pers2.getCartiImprumutate().size())
				return 1;
			return 0;
		}
		
		public void ordonareDupaCarti(){
		// ordonarea descrescatoare dupa nr de carti imprumutate de fiecare persoana
				for(int i=0; i<this.obiecte.size()-1; i++) 
					for(int j =i+1; j<this.obiecte.size(); j++)
						if (better(this.obiecte.get(i), this.obiecte.get(j))==0) {
							Persoana aux = this.obiecte.get(i);
							this.obiecte.set(i, this.obiecte.get(j));
							this.obiecte.set(j,  aux);
							//this.obiecte.add(j, aux);
						}
				}
		
}
