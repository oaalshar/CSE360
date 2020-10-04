/***
 * Name: Omar Alsharif 
 * Class: CSE 360
 * Assignment02
 */
package cse360assignment02;
public class AddingMachine {
	public static void main(String Args[])
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		//Machine1.getTotal();
		System.out.print(myCalculator);
	}
	 private int total;
	 private StringBuffer history;
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = new StringBuffer("0");
	  }
	  // get total function
	  public int getTotal () {
	    return total;
	  }
	  // add function
	  public void add (int value) {
		  total+=value;
		  history.append(" + "+value);
	  }
	  // subtract function
	  public void subtract (int value) {
		  total = total - value;
		  history.append(" - "+ value);
	  }

	  public String toString () {
		  return history.toString();
	  }

	  public void clear() {
	  }

}
