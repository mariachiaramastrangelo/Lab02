package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {
	private Map<String, Word> elenco;
	
	public AlienDictionary() {
		this.elenco= new HashMap<String, Word>();
	}
	
	
	
	
	public List<Word> getElenco() {
		List<Word> elencoLista= new LinkedList<Word>(elenco.values());
		return elencoLista;
	}




	public void addWord(String alienWord, String translation) {
		String a= alienWord.toLowerCase();
		String t= translation.toLowerCase();
		if(elenco.containsKey(a)) {
			elenco.get(a).setTranslation(t);
		}else {
			elenco.put(alienWord, new Word(a, t));
		}
		
		
	}
	
	public String translateWord(String alienWord) {	
		
		if(elenco.containsKey(alienWord.toLowerCase())==true) {
			return elenco.get(alienWord.toLowerCase()).getTranslation();
		}else {
			return null;
		}
		
	}
}
