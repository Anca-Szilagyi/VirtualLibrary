package Repository;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class RepoFile {
	private ArrayList<String> obiecte = new ArrayList<String>();
	
	public RepoFile() {
		this.obiecte = null;
	}
	
	public RepoFile(String filename) {
		//citeste din fisier si salveaza in memorie, intr-un array de vectori de stringuri
		try {
			BufferedReader fisIn = 
			new BufferedReader(new FileReader("d:\\Programe\\LaboratoareMAP\\"+filename));

		String s; 
		//id	String titlu, 	Autor autor: nume, origine, an, 	int an, float pret, 
		//Editura: nume, an, adresa, imprumutata boolean
		s=fisIn.readLine();

		while(s != null) {
			      //String[] splitted = s.split(", ");

			this.obiecte.add(s);

			      s=fisIn.readLine();
				}

		fisIn.close();
	}
		catch (Exception e) {
		     System.out.println("Nu s-a putut citi din fisier.");
		     } 
	}
	
	public ArrayList<String> getObiecteDinFisier() {
		//returneaza arrayList cu toate obiectele citite, un array de vector de stringuri
		return obiecte;
	}
	
	public void cleanArray() {
		//curata array-ul
		this.obiecte.clear();
	}
	
	
	
}
