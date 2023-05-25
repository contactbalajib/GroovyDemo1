class MetaClassDemo {
	static void main(String[] args) {
      Manager mst = new Manager();
      println mst.getName()
      mst.metaClass.setAttribute(mst, 'name', 'Mark')
      println mst.getName()
	  
	  
	  
	  EmptyClass1 ec1 = new EmptyClass1();
	  ec1.Name = "Joe";
	  ec1.ID = 1;
		
	  println(ec1.Name);
	  println(ec1.ID);
	  ec1.AddMarks();
   } 

 }