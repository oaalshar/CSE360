/**
 * Name: Omar Alsharif 
 * Class: CSE 360
 * Assignment02
 */
package cse360assignment02;
public class AddingMachine {
	 private int total;
	 private StringBuffer history;
	 /**
	  * This is my constructor
	  * it initializes total and history 
	  */
	 public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = new StringBuffer("0");
	  }
	  /**
	   * This is a function that returns the total value
	   * @return
	   * @param
	   */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * This is a function that add parameter to the total value
	   * @return
	   * @param
	   */
	  public void add (int value) {
		  total+=value;
		  history.append(" + "+value);
	  }
	  /**
	   * This is a function that subtracts parameter from the total value
	   * @return
	   * @param
	   */
	  public void subtract (int value) {
		  total = total - value;
		  history.append(" - "+ value);
	  }
	  /**
	   * This is a function that prints the history of all transactions
	   * @return
	   */
	  public String toString () {
		  return history.toString();
	  }

	  public void clear() {
		  // java does its own memory garbage collection
	  }

}
