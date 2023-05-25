import java.io.File

class FileDemo1 {
	static void main(String[] args) {
		new File("c:/balaji/test.txt").eachLine {
		   line -> println "line : $line";
		}
		
		println ("------------------------------------")
		//Reading the Contents of a File as an Entire String
		File file = new File("c:/balaji/test.txt")
		println file.text
		
		println ("------------------------------------")
		//Writing to Files
		new File("c:/balaji",'test1.txt').withWriter('utf-8') {
			writer -> writer.writeLine 'Hello World'
		 }
		
		
		println ("------------------------------------")
		//Getting the size of the file
		File fileSize = new File("c:/balaji/test.txt")
		println "The file ${fileSize.absolutePath} has ${fileSize.length()} bytes"
		
		
		println ("------------------------------------")
		def fileDir = new File('c:/')
		println "File? ${fileDir.isFile()}"
		println "Directory? ${fileDir.isDirectory()}"
		
		
		println ("------------------------------------")
		def fileMkdir = new File('c:/groovy-balaji-delete')
		fileMkdir.mkdir()
		
		//copying files
		def src = new File("c:/balaji/test1.txt")
		def dst = new File("c:/balaji/test2.txt")
		dst << src.text
		
		
		//delete file
		def fileDelete = new File('c:/balaji/test1.txt')
		file.delete()
		
		println ("------------------------------------")
		//listing files
		def rootFiles = new File("c:/balaji").listRoots()
		rootFiles.each {
		   filetp1 -> println filetp1.absolutePath
		}
		
		new File("c::/demo").eachFile() {
			filetp2->println filetp2.getAbsolutePath()
		 }
		
		println ("------------------------------------")
		
		new File("c:/demo").eachFileRecurse() {
			filerecursive -> println filerecursive.getAbsolutePath()
		 }
		 
		 println ("------------------------------------")
	 }
}