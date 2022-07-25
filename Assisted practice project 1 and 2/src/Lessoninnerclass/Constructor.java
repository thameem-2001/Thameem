package Lessoninnerclass;

public class Constructor {

	private String name;
	  Constructor() {
	    System.out.println("Constructor Called:");
	    name = "Simplilearn";
	   
	  }
	  public static void main(String[] args) {
		  Constructor object = new Constructor();
	    System.out.println("The name is " + object.name);
	    
	  }
	}
