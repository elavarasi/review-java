package objectcreation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Item1_StaticFactoryMethod {
	public static void main(String args[]) {
		String val = new String("Ela");
		String val2 = String.valueOf("ela");  //static factory method
		System.out.println(val);
		System.out.println(val2);
		

		Collection<Object> originalCollection = null;
		Collection<Object> synchedCollection = Collections.synchronizedCollection(originalCollection );
		
		Set synchedSet = Collections.synchronizedSet(new HashSet());
		
		
		
		
	}
}
