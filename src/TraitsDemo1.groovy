class TraitsDemo1 {
	static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      println(st.DisplayMarks());
   } 
 }
 
 trait Marks {
   void DisplayMarks() {
      println("Marks1");
   } 
} 

trait Total extends Marks {
   void DisplayMarks() {
      println("Total");
   } 
}  

class Student implements Total {
   int StudentID 
}