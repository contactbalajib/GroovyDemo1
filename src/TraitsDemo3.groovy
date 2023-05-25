class TraitsDemo3 {
	static void main(String[] args) {
	   Student2 st = new Student2();
      st.StudentID = 1;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal());
	}
	
	
 }
 
 interface Total2 {
	 void DisplayTotal()
  }
   
  trait Marks2 implements Total2 {
	 int Marks1;
	   
	 void DisplayMarks() {
		this.Marks1 = 10;
		println(this.Marks1);
	 }
	   
	 void DisplayTotal() {
		println("Display Total");
	 }
  }
   
  class Student2 implements Marks2 {
	 int StudentID
  }