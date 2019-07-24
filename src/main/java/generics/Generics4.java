package generics;

import java.util.ArrayList;

class Generics4 {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("ela");
		
		
//		String str1 = (String) a1.get(0);
//		String str2 = (String) a1.get(1);
		
		
		//Using Generics If we know we only need string
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("ela");
		a2.add("kanag");
		
		String str3 = a2.get(0);
		String str4 = a2.get(1);
		System.out.println(str3);
		System.out.println(str4);
		
	}	
	
	
}