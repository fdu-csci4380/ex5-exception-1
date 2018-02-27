/**
 * 
 */
package fdu.ex.exception.users;

import fdu.ex.exception.MyChildException;
import fdu.ex.exception.MyException;
import fdu.ex.exception.MyException2;

/**
 * @author ilker
 *
 */
public class UseMeParent {
	public static enum Exception2throw {
		throwMyException, throwMyChildException, throwMyException2
	}
	
	public String method1(boolean throwException) throws MyException {
		System.out.println("method1 - A");
		
		if(throwException) {
			throw new MyException("method1 threw MyException");	// NOTE ilker - OK, this or below line are both OK
//			throw new MyChildException("method1 threw MyChildException"); // NOTE ilker - OK, method throws MyException. And both MyException and MyChildException are MyException. So, OK to throw either one.
//			System.out.println("method1 - B1 - never executes this line");
		} else {
			System.out.println("method1 - B2 - executes this line");
		}
		return "method1 returnedMe";
	}
	
	public String method2(boolean throwException) throws MyChildException{
		System.out.println("method1 - A");
		
		if(throwException) {
//			throw new MyException("method2 threw MyException");	// NOTE ilker - WRONG, will not compile. Method throws MyChildException. MyException is not MyChildException.
			throw new MyChildException("method2 threw MyChildException");
//			System.out.println("method2 - B1 - never executes this line");
		} else {
			System.out.println("method2 - B2 - executes this line");
		}
		return "method2 returnedMe";
	}

	public String method12(boolean throwException, Exception2throw exception2throw) throws MyException, MyException2 {
		System.out.println("method1 - A");
		
		if(throwException) {
			switch (exception2throw) {
			case throwMyException:
				throw new MyException("method2 threw MyException");
			case throwMyChildException:
				throw new MyChildException("method2 threw MyChildException");
			case throwMyException2:
				throw new MyException2("method2 threw MyException2");
			default:
				break;
			}
//			System.out.println("method12 - B1 - never executes this line");
		} else {
			System.out.println("method12 - B2 - executes this line");
		}
		return "method2 returnedMe";
	}
}
