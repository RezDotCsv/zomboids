package zomboids;

import java.util.ArrayList;
import java.util.List;

public class Zombie {

	private String typeOfZombie;
	private List<String> weakness = new ArrayList<String>();
	
	public Zombie(String typeOfZombie) {
		this.typeOfZombie = typeOfZombie;//I remember last time you advised against two 
										 //constructors but I think it makes sense now
										 //since it is possible that there is a zombie but you don't know its
										 // weakness yet
		
	}
	
	public Zombie(String typeOfZombie,String weakness) {
		this.typeOfZombie = typeOfZombie;
		this.weakness.add(weakness);
	}
	
	public void addWeakness(String s) {
		
			weakness.add(s);
		
	}
	public void removeWeakness(String s) {
		
		weakness.remove(s);
	
	}
	public void addWeakness(ArrayList<String> s) {
		
		for(String n: s) {
			weakness.add(n);
		}	
	}
	
	public String getTypeOfZombie() {
		return typeOfZombie;
	}
	
	public List<String> getWeakness() {
		return weakness;
	}
	
	public String toString() {
		if(weakness.size() == 0) {
			return "Type: "+ typeOfZombie+" has no known weakness.";
		}
		String weakTo ="";
		
		for(String s: weakness) {
			weakTo += s.toLowerCase() +", ";
		}
		
		//what can I google to find some of the better ways to format string stuff; I tried for a bit and it was just a loop
		//of basic print statements that were not what I was looking for
		return "Type: "+ typeOfZombie+" is weak to " + weakTo;
	}
}
