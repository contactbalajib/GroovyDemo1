class MethodDemo1 {
	static def DisplayName() {
		println("This is how methods work in groovy");
		println("This is an example of a simple method");
	}

	static void main(String[] args) {
		DisplayName();
		MethodDemo1 m = new MethodDemo1();
		m.methodName();
		sumInt(1,3);
		sum(1,3);
		sum("Balaji ", " is")
		sum(100)
	}

	static void sumInt(int a,int b) {
		int c = a+b;
		println("SUM of integer a, b is: " + c);
	}
	
	static void sum(def a,def b) {
		def c = a + b;
		println("SUM of def a, b is: " + c);
	}

	def methodName() {
		println("Inside default public access modifier method")
	}
	
	//default method param
	static void sum(int a,int b = 5) {
		int c = a+b;
		println(c);
	 }
}