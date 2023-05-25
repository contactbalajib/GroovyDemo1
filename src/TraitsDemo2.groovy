class TraitsDemo2 {
	static void main(String[] args) {
	   Student1 st = new Student1();
	   st.StudentID = 1;
		 
	   println(st.DisplayMarks());
	   println(st.DisplayTotal());
	}
 }
 
 trait Marks1 {
	void DisplayMarks() {
	   println("Marks1");
	}
 }
 
 trait Total1 {
	void DisplayTotal() {
	   println("Total");
	}
 }
 
 class Student1 implements Marks1,Total1 {
	int StudentID
 }