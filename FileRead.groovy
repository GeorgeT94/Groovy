import java.io.File 
class FileRead { 
   static void main(String[] args) { 
      new File("C:/Example.txt").eachLine {  
         line -> println "line : $line"; 
      } 
   } 
}