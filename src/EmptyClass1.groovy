class EmptyClass1  implements GroovyInterceptable {
	protected dynamicProps = [:]

	void setProperty(String pName, val) {
		dynamicProps[pName] = val
	}

	def getProperty(String pName) {
		dynamicProps[pName]
	}

	/*
	def invokeMethod(String name, Object args) {
		return "called invokeMethod $name $args"
	}
	*/
	def methodMissing(String name, def args) {
		println "Missing method"
	 }
}