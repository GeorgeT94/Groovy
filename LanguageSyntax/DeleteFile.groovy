import java.io.File 

class DeleteFile {
   static void main(String[] args) {
      def file = new File('C:/Example.txt')
      file.delete()
   } 
}