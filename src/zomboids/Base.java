package zomboids;

import java.util.HashMap;
import java.util.Map;

public class Base {
   
	 Map<String,Zombie> map= new HashMap<String,Zombie>();;
 
   public void add(String zombie,Zombie zeds) {
	   map.put(zombie, zeds);
   }
   
   public String searchForWeaknessOf(String zombie) {
	   return map.get(zombie).toString();
   }
   public Zombie getZombie(String zombie) {
	   return map.get(zombie);
   }
   
}
