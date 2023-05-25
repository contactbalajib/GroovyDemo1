String.metaClass.trim = {
	
	 str -> println "inside the trim"
	 //return str + "-balaji"
}

String.metaClass.doSomething = {
	
	  -> println "inside the doSomething"
	 return str + "-balaji"
}

name = 'jothi'
println name.trim() 
println name.doSomething()