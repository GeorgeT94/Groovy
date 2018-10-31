class This { 
   int x = 100; 
	
   public int getX() { 
      this.x = 200; 
      return x; 
   } 
	
   static void main(String[] args) {
      Example ex = new Example(); 
      println(ex.getX());
   }
}