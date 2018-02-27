/**
 * 
 */
package fdu.ex.exception;

/**
 * @author ilker
 *
 */
public class MyException extends Exception {
	public MyException(String _msg)
	{
		super(_msg);
	}
	
	public MyException(Throwable _e) {
		super(_e);
	}
}
