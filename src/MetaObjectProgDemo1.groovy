class Student3 implements GroovyInterceptable {
	protected dynamicProps=[:]

	void setProperty(String pName,val) {
		dynamicProps[pName] = val
	}

	def getProperty(String pName) {
		dynamicProps[pName]
	}
}


class MOP1 {
	static void main(String[] args) {
	   Student3 mst = new Student3();
	   mst.Name = "Joe";
	   mst.ID = 1;
		 
	   println(mst.Name);
	   println(mst.ID);
	}
 }
 