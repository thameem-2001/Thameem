package Lessoninnerclass;

public class AccessModifier {
	 private String name;
	    public String getName() {
	        return this.name;
	    }
	    public void setName(String name) {
	        this.name= name;
	    }
	}
	class Main {
	    public static void main(String[] main){
	        AccessModifier d = new AccessModifier();
	        d.setName("Simplilearn Access modifier");
	        System.out.println(d.getName());
	    }
	}



