package Lessoninnerclass;

public class Method {
	public int addNumbers(int x, int y) {
	    int sum = x + y;
	    return sum;
	  }
	  public static void main(String[] args) {
	    int num1 = 30;
	    int num2 = 20;
	    Method obj = new Method();
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }
	}

