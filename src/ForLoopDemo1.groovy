int[] intList = new int[] {100, 200, 300 };

for(int cnt : intList) {
	println "$cnt"
}

for(int cnt in intList) {
	println "$cnt"
}

intList.each { println "${it}" }

intList.each((cnt) -> { println "$cnt" })

intList.each((cnt) -> { 
	if(cnt > 100) {
	println "$cnt" 
	} else {
		println "It is 100 or less than that"
	}
})