/**
 * 
 */
package fdu.ex.exception;

/**
 * @author ilker
 *
 */
public class MyException2 extends Exception {
	public MyException2(String _msg) {
		super(_msg);
	}
	public MyException2(Exception _e) {
		super(_e);
	}
}
