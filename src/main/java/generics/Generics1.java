package generics;

class Test<T> {
	T obj;

	Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
}


class Generics1 {
	public static void main(String[] args) {
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.print(iObj.getObject());
		
		Test<String> sObj = new Test<String>("Ela here");
		System.out.println(sObj.getObject());		
	}	
}