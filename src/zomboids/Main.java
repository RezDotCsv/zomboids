package zomboids;

import java.util.ArrayList;

public class Main {
	static Base base = new Base();
	static Zombie spitter = new Zombie("Spitter","Ranged attacks");
	static Zombie flyingRat = new Zombie("Fly Rat");

	
	public static void main(String[] args) {
		base.add("Spitter", spitter);
		base.add("FlyRat", flyingRat);
		
		
		System.out.println(base.searchForWeaknessOf("Spitter"));
		
		System.out.println(base.searchForWeaknessOf("FlyRat"));
		base.getZombie("FlyRat").removeWeakness("The swatter");
		base.getZombie("FlyRat").addWeakness("apple cider");
		base.getZombie("FlyRat").addWeakness("failure");
		System.out.println(base.searchForWeaknessOf("FlyRat"));
		base.getZombie("FlyRat").removeWeakness("failure");
		System.out.println(base.searchForWeaknessOf("FlyRat"));
	}
}
