package arraylist;

public class ArrayList<T> {

	private static final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   		this(DEFAULT_SIZE);
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  currentItem=0;
	  
    }//end preferred constructor
  
  public boolean addItem(T item) {
      if (currentItem < arList.length) {
          arList[currentItem++] = item;
          return true;
      } else {
          return false;
      }
  }

  @Override
  public String toString() {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < currentItem; i++) {
          result.append(arList[i].toString()).append("\n");
      }
      return result.toString();
  }
}//end class
