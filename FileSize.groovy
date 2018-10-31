import java.io.File 
class Example {
   static void main(String[] args) {
      File file = new File("C:/Example.txt")
      println "The file ${file.absolutePath} has ${file.length()} bytes"
   } 
}
