/**
 * 
 */
package fdu.ex.exception.users;

import fdu.ex.exception.MyException;

/**
 * @author ilker
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// NOTE ilker, below is 1 of 2 ways to "handle" a Checked Exception - throwing it
	public void test_1a() throws MyException {
		UseMeParent useMeParent = new UseMeParent();
		useMeParent.method1(true);
	}

	// NOTE ilker, below is 2nd of 2 ways to "handle" a Checked Exception - catching it in try/catch/finally
	public void test_1b() {
		UseMeParent useMeParent = new UseMeParent();
		try {
			useMeParent.method1(true);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
