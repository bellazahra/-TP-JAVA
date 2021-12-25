package cigma.pfe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rappel {

	public static void main(String[] args) {
		List<Laptop> l = new ArrayList<>();
		l.add(new Laptop(10));
		l.add(new Laptop(20));
		l.add(1,new Laptop(5));
		l.forEach(i-> System.out.println(i));
		
	
	
	Set<Laptop> l1 = new HashSet<>();
	l1.add(new Laptop(12.000));
	l1.add(new Laptop(13.6));
	l1.add(new Laptop(12));
	l1.add(new Laptop(15.4));
	l1.add(new Laptop(13.600));
	l1.add(new Laptop(13.60));
	l1.forEach(i-> System.out.println(i));
	}


}
