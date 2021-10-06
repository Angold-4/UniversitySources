class NestedLoopDemo {
   public static void main(String[] args) {
      
	  //example 1
      System.out.println("Example 1: \n");	 
      
      //outer loop 
      for (int i = 1; i <=5; i++) {
         System.out.println("Outer loop i = " + i);

         //inner loop
         for (int j = 1; j <=2; j++) {
            System.out.println("\t Inner loop j = " + j);
         }
      }
      
      
	  //example 2
      System.out.println("\n\nExample 2: \n");	  	  
      for (int k = 0; k <3; k++) {
         for (int n = 0; n <5; n++) {
            System.out.print("*");
         }        
      	 System.out.println();      
      }
      
   }
   
}