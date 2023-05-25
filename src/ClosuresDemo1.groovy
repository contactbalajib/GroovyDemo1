
import groovy.transform.PackageScope

class ClosuresDemo1 {
	def static Display(clo) {
		// This time the $param parameter gets replaced by the string "Inner"
		clo.call("Inner");
	 }
  
	
	static void main(String[] args) {
		def clos = {println "Hello World"};
		clos.call();
		
		def clos1 = {param->println "Hello ${param}"};
		clos1.call("World");
  
		def clos2 = {println "Hello ${it}"};
		clos2.call("World");
		
		
		def str1 = "Hello";
		def clos3 = {param -> println "${str1} ${param}"}
		clos3.call("World");
		  
		// We are now changing the value of the String str1 which is referenced in the closure
		str1 = "Welcome";
		clos3.call("World");
		
		// Passing our closure to a method
		ClosuresDemo1.Display(clos3);
		
		
		def lst = [1, 11, 12, 13, 14];
		lst.each {println it}
		println("The list will only display those numbers which are divisible by 2")
		lst.each{num -> if(num % 2 == 0) println num}
  
		
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
		mp.each {println it}
		mp.each {println "${it.key} maps to: ${it.value}"}
		
		
		def value;
		value = lst.findAll{element -> element > 2}
		value.each {println it}
		
		// Is there any value above 2
		value = lst.any{element -> element > 2}
		println(value);
		  
		// Is there any value above 4
		value = lst.any{element -> element > 4}
		println(value);
		
		
		
		
		
		
		
		
		
		
		def lst1 = [1,2,3,4];
		def value1;
		  
		// Are all value above 2
		value1 = lst1.every{element -> element > 2}
		println(value1);
		  
		// Are all value above 4
		value1 = lst1.every{element -> element > 4}
		println(value1);
		def largelst = [4,5,6];
		  
		// Are all value above 2
		value1 = largelst.every{element -> element > 2}
		println(value1);
  
  
		
		
		def lst2 = [1,2,3,4];
		def newlst = [];
		newlst = lst2.collect {element -> return element * element}
		println(newlst);
  

  
  
	}
}