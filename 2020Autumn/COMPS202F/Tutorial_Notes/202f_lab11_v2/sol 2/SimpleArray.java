public class SimpleArray {
	
  private int[] courseCount = {2, 7, 2, 3, 8, 7 };
  
  public int findMaximum() {
    int max = courseCount[0];
    
    for (int i=0; i< courseCount.length; i++) {
	    if (courseCount[i] > max)
    	    max = courseCount[i];
    }
              
    return max;
  }
  
  public double findAverage() {
    double sum = 0;
    
    for (int i=0; i<courseCount.length; i++)
      sum += courseCount[i];
            
    return sum / courseCount.length;
    
    //optional: round to 2 dp
    //return (double) Math.round(sum / courseCount.length * 100)/100;    
  }
  
  public boolean exists(int aCount) {
    boolean found = false;
   
    for (int i=0; i<courseCount.length; i++){
    	if (aCount == courseCount[i]){
      		found = true;
      		break;
  		}
	}
	
    return found;
  }

  public void findDuplicate(){
    for (int i = 0; i < courseCount.length-1; i++){
        for (int j = i+1; j < courseCount.length; j++){
            if ((courseCount[i] == courseCount[j]) && (i != j)){
                System.out.println("Duplicate value: "+courseCount[j] + " at index: [" + i + "],[" + j +"]" );
            }
        }
    }
  }    
}