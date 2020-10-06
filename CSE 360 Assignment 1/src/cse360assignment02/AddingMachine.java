package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str = "0 ";
  
  public static void main(String[] args) { //main method for testing
	 AddingMachine myCalculator = new AddingMachine();
	 myCalculator.add(4);
	 myCalculator.subtract(2);
	 myCalculator.add(5);
	 String str = myCalculator.toString();
	 System.out.println(str);
  }
  
  public AddingMachine () { //class object constructor
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () { //returns current total
    return total;
  }
  
  public void add (int value) { //adds parameter to current total
	  total += value;
	  str += "+ " + value + " ";
  }

  public void subtract (int value) {//subtracts parameter from current total
	  total -= value;
	  str += "- " + value + " ";
  }

  public String toString () { //returns a string of operations
    return str;
  }

  public void clear() { //resets total to 0
	  total = 0;
  }
}
