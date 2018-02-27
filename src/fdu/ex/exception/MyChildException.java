/**
 * 
 */
package fdu.ex.exception;

/**
 * @author ilker
 *
 */
public class MyChildException extends MyException {
	public MyChildException(String _msg) {
		super(_msg);
	}
	
	public MyChildException(Throwable _e) {
//	public MyChildException(Exception _e) {
		super(_e);
	}
}
